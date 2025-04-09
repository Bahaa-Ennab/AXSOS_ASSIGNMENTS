from django.urls import path, include
from . import views
urlpatterns = [
    path('destroy', views.destroy),
    path('', views.index),
    path('increment',views.increment)
]
