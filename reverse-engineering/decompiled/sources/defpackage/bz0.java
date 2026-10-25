package defpackage;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11238a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TextStyle c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ bz0(long j, TextStyle textStyle, Function2 function2, int i, int i2) {
        this.f11238a = i2;
        this.b = j;
        this.c = textStyle;
        this.d = function2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11238a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ProvideContentColorTextStyleKt.ProvideContentColorTextStyle_3J_VO9M$lambda$0(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextFieldImplKt.Decoration_3J_VO9M$lambda$20(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
        }
    }
}
