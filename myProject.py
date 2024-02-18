from locust import HttpUser, task, between

class Website(HttpUser):
    host = "https://kariyer.baykartech.com"
    wait_time = between(3, 6)

    @task
    def homePage(self):
        self.client.get("/tr/")

    @task()
    def searchJobs(self):
        self.client.get("/tr/basvuru/acik-pozisyonlar/")
        self.client.get("/tr/basvuru/acik-pozisyonlar/#program=22,39")

    @task()
    def faqPage(self):
        self.client.get("/tr/sss/personel")

    @task()
    def changeLanguage(self):
        self.client.get("/en/")
        self.client.get("/en/application/open-positions/lead-project-engineer")
        response1 = self.client.get("/en/program/status-form/0/?program_id=411")
        response2 = self.client.post("/en/parameter/file-upload")
        if response1.status_code == 200 and response2.status_code ==200 :
            print("Successful")
            self.client.post("/en/program/status-form/0/?program_id=411")
        else :
            print("Failed")

    @task
    def login(self):
        loginData = {
            "username": "test@gmail.com",
            "password": "Test123_."
        }
        response = self.client.post("/tr/hesaplar/login/?next=/tr/dashboard/", json=loginData)
        if response.status_code == 200 :
            print("Login successful")
            self.client.get("/tr/dashboard/")
            self.client.get("/tr/cikis/")
        else :
            print("Failed")

    @task
    def createAccount(self):
        newUser = {
            "first_name": "Fikriye",
            "last_name": "Barut",
            "email": "fikriye.barut9@gmail.com",
            "password": "password123"
        }
        response = self.client.post("/tr/hesaplar/signup/", json=newUser)

        if response.status_code == 200:
            print("Successfully")
        else:
            print("Failed")    
 