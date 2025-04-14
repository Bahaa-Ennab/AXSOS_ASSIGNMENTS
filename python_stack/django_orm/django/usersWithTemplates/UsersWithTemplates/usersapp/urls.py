from django.urls import path
from . import views
urlpatterns = [
    path('', views.index),
    path('user_post', views.user_post),
]
