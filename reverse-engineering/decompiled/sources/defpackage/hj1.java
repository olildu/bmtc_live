package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15833a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ TimePickerColors c;
    public final /* synthetic */ TimePickerState d;
    public final /* synthetic */ int e;

    public /* synthetic */ hj1(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, int i) {
        this.f15833a = 1;
        this.b = modifier;
        this.c = timePickerColors;
        this.d = timePickerState;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15833a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                TimePickerState timePickerState = this.d;
                return TimePickerKt.VerticalPeriodToggle$lambda$39(this.b, timePickerState, this.c, this.e, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                TimePickerState timePickerState2 = this.d;
                return TimePickerKt.TimeInputImpl$lambda$28(this.b, this.c, timePickerState2, this.e, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                TimePickerState timePickerState3 = this.d;
                return TimePickerKt.HorizontalPeriodToggle$lambda$37(this.b, timePickerState3, this.c, this.e, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ hj1(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, int i, int i2) {
        this.f15833a = i2;
        this.b = modifier;
        this.d = timePickerState;
        this.c = timePickerColors;
        this.e = i;
    }
}
