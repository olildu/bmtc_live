package defpackage;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.MotionScheme;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18599a;
    public final /* synthetic */ ColorScheme b;
    public final /* synthetic */ MotionScheme c;
    public final /* synthetic */ Shapes d;
    public final /* synthetic */ Typography e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ oh0(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, Function2 function2, int i, int i2, int i3) {
        this.f18599a = i3;
        this.b = colorScheme;
        this.c = motionScheme;
        this.d = shapes;
        this.e = typography;
        this.f = function2;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18599a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return MaterialThemeKt.MaterialTheme$lambda$1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return MaterialThemeKt.MaterialExpressiveTheme$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }
}
