// Copyright 2017 Archos SA
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.archos.mediascraper.themoviedb3;

import java.util.Collections;
import java.util.List;

public class MovieIdImagesResult {
    public static final List<String> EMPTY_LIST = Collections.<String>emptyList();
    public List<String> posterPaths;
    public List<String> backdropPaths;
    public MovieIdImagesResult() {
        this.posterPaths = EMPTY_LIST;
        this.backdropPaths = EMPTY_LIST;
    }
}
