package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15560a;
    public final /* synthetic */ TimePickerState b;
    public final /* synthetic */ TimePickerColors c;
    public final /* synthetic */ int d;

    public /* synthetic */ ej1(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, int i2) {
        this.f15560a = i2;
        this.b = timePickerState;
        this.c = timePickerColors;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15560a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return TimePickerKt.VerticalClockDisplay$lambda$34(this.b, this.c, this.d, composer, iIntValue);
            case 1:
                return TimePickerKt.HorizontalClockDisplay$lambda$31(this.b, this.c, this.d, composer, iIntValue);
            default:
                return TimePickerKt.ClockDisplayNumbers$lambda$35(this.b, this.c, this.d, composer, iIntValue);
        }
    }
}
