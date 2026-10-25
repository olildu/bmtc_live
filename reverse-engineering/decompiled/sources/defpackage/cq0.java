package defpackage;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class cq0 {
    public static /* synthetic */ boolean a(PathMeasure pathMeasure, float f, float f2, Path path, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return pathMeasure.getSegment(f, f2, path, z);
    }
}
