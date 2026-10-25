package defpackage;

import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.DateRangePickerStateImpl;
import androidx.compose.material3.SelectableDates;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15497a;
    public final /* synthetic */ SelectableDates b;
    public final /* synthetic */ Locale c;

    public /* synthetic */ dw(SelectableDates selectableDates, Locale locale, int i) {
        this.f15497a = i;
        this.b = selectableDates;
        this.c = locale;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15497a) {
            case 0:
                return DatePickerStateImpl.Companion.Saver$lambda$1(this.b, this.c, (List) obj);
            default:
                return DateRangePickerStateImpl.Companion.Saver$lambda$1(this.b, this.c, (List) obj);
        }
    }
}
