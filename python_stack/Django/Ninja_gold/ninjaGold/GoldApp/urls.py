from django.urls import path
from . import views 
urlpatterns = [
    path('',views.index),
    path('farm',views.farm),
    path('cave',views.cave),
    path('house',views.house),
    path('earnorlose',views.earnorlose),
    path('reset',views.reset),

]