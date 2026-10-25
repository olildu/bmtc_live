package defpackage;

import androidx.compose.material3.TimePickerDialogDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayoutKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15731a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gh(int i, int i2, int i3, Modifier modifier, String str, String str2) {
        this.b = i;
        this.d = i2;
        this.f = str;
        this.c = modifier;
        this.g = str2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15731a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloBusScreenHeaderLayoutKt.a(this.b, this.d, (String) this.f, this.c, (String) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return TimePickerDialogDefaults.DisplayModeToggle_S7Bxtbk$lambda$0((TimePickerDialogDefaults) this.f, (Function0) this.g, this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ gh(TimePickerDialogDefaults timePickerDialogDefaults, Function0 function0, int i, Modifier modifier, int i2, int i3) {
        this.f = timePickerDialogDefaults;
        this.g = function0;
        this.b = i;
        this.c = modifier;
        this.d = i2;
        this.e = i3;
    }
}
