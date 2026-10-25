package defpackage;

import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DateRangePickerDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ov implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18981a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ov(Object obj, int i, Modifier modifier, long j, int i2, int i3, int i4) {
        this.f18981a = i4;
        this.g = obj;
        this.b = i;
        this.c = modifier;
        this.d = j;
        this.e = i2;
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18981a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerDefaults.DatePickerTitle_FNtVw6o$lambda$1((DatePickerDefaults) this.g, this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DateRangePickerDefaults.DateRangePickerTitle_FNtVw6o$lambda$0((DateRangePickerDefaults) this.g, this.b, this.c, this.d, this.e, this.f, (Composer) obj, iIntValue2);
        }
    }
}
