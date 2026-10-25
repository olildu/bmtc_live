package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPathIterator_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathOperation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class aq0 {
    static {
        Path.Companion companion = Path.INSTANCE;
    }

    public static /* synthetic */ void A(Path path, Rect rect, Path.Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    public static /* synthetic */ void B(Path path, RoundRect roundRect, Path.Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }

    public static /* synthetic */ PathIterator C(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return path.iterator(conicEvaluation, f);
    }

    public static Path a(Path path, Path path2) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4500opN5in7k0(path, path2, PathOperation.INSTANCE.m4889getIntersectb3I0S0c());
        return Path;
    }

    public static void b(Path path, Rect rect, float f, float f2, boolean z) {
        path.arcTo(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z);
    }

    public static PathIterator c(Path path) {
        return AndroidPathIterator_androidKt.PathIterator$default(path, null, 0.0f, 6, null);
    }

    public static PathIterator d(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        return AndroidPathIterator_androidKt.PathIterator(path, conicEvaluation, f);
    }

    public static Path e(Path path, Path path2) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4500opN5in7k0(path, path2, PathOperation.INSTANCE.m4888getDifferenceb3I0S0c());
        return Path;
    }

    public static Path f(Path path, Path path2) {
        return path.plus(path2);
    }

    public static Path g(Path path, Path path2) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4500opN5in7k0(path, path2, PathOperation.INSTANCE.m4891getUnionb3I0S0c());
        return Path;
    }

    public static void h(Path path, float f, float f2, float f3, float f4) {
        path.quadraticBezierTo(f, f2, f3, f4);
    }

    public static void i(Path path, float f, float f2, float f3, float f4) {
        path.relativeQuadraticBezierTo(f, f2, f3, f4);
    }

    public static void j(Path path) {
        path.reset();
    }

    public static Path l(Path path, Path path2) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4500opN5in7k0(path, path2, PathOperation.INSTANCE.m4892getXorb3I0S0c());
        return Path;
    }

    public static /* synthetic */ void y(Path path, Rect rect, Path.Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.addOval(rect, direction);
    }

    public static /* synthetic */ void z(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m4381getZeroF1C5BW0();
        }
        path.mo4498addPathUv8p0NA(path2, j);
    }

    public static void k(Path path, float[] fArr) {
    }
}
