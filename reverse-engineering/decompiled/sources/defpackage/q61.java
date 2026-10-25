package defpackage;

import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q61 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19095a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ q61(Modifier modifier, float f, Function function, int i, int i2, int i3) {
        this.f19095a = i3;
        this.b = modifier;
        this.c = f;
        this.d = function;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19095a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$10(this.b, this.c, (Function3) this.d, this.e, this.f, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SegmentedButtonKt.MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$13(this.b, this.c, (Function3) this.d, this.e, this.f, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TimePickerKt.CircularLayout$lambda$96(this.b, this.c, (Function2) this.d, this.e, this.f, (Composer) obj, iIntValue3);
        }
    }
}
