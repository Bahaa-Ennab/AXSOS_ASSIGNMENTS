# Generated by Django 4.2.20 on 2025-04-19 12:28

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('tempapp', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='books',
            old_name='desc',
            new_name='description',
        ),
    ]
