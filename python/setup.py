import os
from setuptools import setup

setup(
    name="words",
    version="0.0.1",
    description=("Code Styles Python starter",),
    license="MIT",
    keywords="Python",
    packages=['words'],
    setup_requires=[
        'pytest-runner',
    ],
    tests_require=[
        'pytest',
    ]
)
