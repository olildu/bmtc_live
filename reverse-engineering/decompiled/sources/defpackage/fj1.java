package defpackage;

import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15648a;
    public final /* synthetic */ AnalogTimePickerState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ TimePickerColors d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ fj1(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2, int i3) {
        this.f15648a = i3;
        this.b = analogTimePickerState;
        this.c = modifier;
        this.d = timePickerColors;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15648a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TimePickerKt.VerticalTimePicker$lambda$11(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TimePickerKt.HorizontalTimePicker$lambda$15(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, iIntValue2);
        }
    }
}
