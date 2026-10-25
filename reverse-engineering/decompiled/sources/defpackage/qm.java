package defpackage;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import app.chalo.compose.ChaloToolBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19133a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qm(Modifier modifier, String str, long j, String str2, int i, int i2) {
        this.f19133a = 0;
        this.c = modifier;
        this.b = str;
        this.d = j;
        this.g = str2;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19133a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.g(this.c, this.b, this.d, (String) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                return Unit.f17538a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return IconKt.Icon_ww6aTOc$lambda$0((ImageVector) this.g, this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return IconKt.Icon_ww6aTOc$lambda$2((ImageBitmap) this.g, this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return IconKt.Icon_ww6aTOc$lambda$6((Painter) this.g, this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ qm(Object obj, String str, Modifier modifier, long j, int i, int i2, int i3) {
        this.f19133a = i3;
        this.g = obj;
        this.b = str;
        this.c = modifier;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
