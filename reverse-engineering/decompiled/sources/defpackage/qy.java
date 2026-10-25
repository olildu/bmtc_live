package defpackage;

import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19162a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ qy(Modifier modifier, float f, long j, int i, int i2, int i3) {
        this.f19162a = i3;
        this.b = modifier;
        this.c = f;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19162a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DividerKt.Divider_9IZ8Weo$lambda$6(this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DividerKt.VerticalDivider_9IZ8Weo$lambda$5(this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DividerKt.HorizontalDivider_9IZ8Weo$lambda$2(this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier = this.b;
                float f = this.c;
                return ProgressIndicatorKt.CircularProgressIndicator_aM_cp0Q$lambda$40(modifier, this.d, f, this.e, this.f, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ qy(Modifier modifier, long j, float f, int i, int i2) {
        this.f19162a = 3;
        this.b = modifier;
        this.d = j;
        this.c = f;
        this.e = i;
        this.f = i2;
    }
}
