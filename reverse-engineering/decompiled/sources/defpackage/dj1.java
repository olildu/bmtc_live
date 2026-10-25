package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dj1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15469a;
    public final /* synthetic */ TimePickerState b;

    public /* synthetic */ dj1(int i, TimePickerState timePickerState) {
        this.f15469a = i;
        this.b = timePickerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15469a) {
            case 0:
                return TimePickerKt.TimeInputImpl$lambda$17$lambda$16(this.b);
            case 1:
                return TimePickerKt.PeriodToggleImpl$lambda$46$lambda$43$lambda$42(this.b);
            case 2:
                return TimePickerKt.TimeInputImpl$lambda$21$lambda$20(this.b);
            default:
                return TimePickerKt.PeriodToggleImpl$lambda$46$lambda$45$lambda$44(this.b);
        }
    }
}
