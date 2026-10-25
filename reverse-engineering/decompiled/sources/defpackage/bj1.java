package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11203a = 1;
    public final /* synthetic */ TimePickerState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ TimePickerColors d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ bj1(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, int i2, int i3) {
        this.b = timePickerState;
        this.c = modifier;
        this.d = timePickerColors;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11203a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                TimePickerState timePickerState = this.b;
                Modifier modifier = this.c;
                TimePickerColors timePickerColors = this.d;
                return TimePickerKt.TimeSelector_SAnMeKU$lambda$59(modifier, this.e, timePickerState, this.f, timePickerColors, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TimePickerKt.TimePicker_mT9BvqQ$lambda$4(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ bj1(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, int i3) {
        this.c = modifier;
        this.e = i;
        this.b = timePickerState;
        this.f = i2;
        this.d = timePickerColors;
        this.g = i3;
    }
}
