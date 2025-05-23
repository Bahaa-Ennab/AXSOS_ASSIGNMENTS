from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('register', views.register),
    path('deleteuser', views.deleteuser),
    path('login', views.login),
    path('welcome', views.welcome),
    path('log_out', views.log_out),
]