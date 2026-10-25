package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20234a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ LazyListState c;

    public /* synthetic */ zv(LazyListState lazyListState, CoroutineScope coroutineScope, int i) {
        this.f20234a = i;
        this.c = lazyListState;
        this.b = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20234a) {
            case 0:
                return DatePickerKt.DatePickerContent$lambda$36$lambda$29$lambda$28(this.b, this.c);
            case 1:
                return DatePickerKt.DatePickerContent$lambda$36$lambda$31$lambda$30(this.b, this.c);
            case 2:
                return Boolean.valueOf(DateRangePickerKt.customScrollActions$lambda$16(this.c, this.b));
            default:
                return Boolean.valueOf(DateRangePickerKt.customScrollActions$lambda$17(this.c, this.b));
        }
    }

    public /* synthetic */ zv(CoroutineScope coroutineScope, LazyListState lazyListState, int i) {
        this.f20234a = i;
        this.b = coroutineScope;
        this.c = lazyListState;
    }
}
