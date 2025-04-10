from django.urls import path, include
from . import views
urlpatterns = [
    path('',views.index),
    path('usernumber',views.usernumber),
]