from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('register', views.register),
    path('deleteuser', views.deleteuser),
    path('login', views.login),
    path('codingdojowall', views.codingdojowall),
    path('log_out', views.log_out),
    path('post_message/<int:userid>', views.post_message),
    path('post_message/<int:userid>', views.post_message),
    path('delete_messages', views.delete_messages),
    path('make_comment/<int:messageid>', views.make_comment),
]
