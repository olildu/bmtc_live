package app.chalo.compose.components.dialogs;

import androidx.compose.material3.SelectableDates;
import app.chalo.extensions.KotlinDateTimeExtensionsKt;
import defpackage.oj;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/compose/components/dialogs/ChaloDatePickerKt$betweenRange$1", "Landroidx/compose/material3/SelectableDates;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloDatePickerKt$betweenRange$1 implements SelectableDates {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f1889a;
    public final Lazy b;
    public final /* synthetic */ String c;

    public ChaloDatePickerKt$betweenRange$1(long j, long j2, String str) {
        this.c = str;
        this.f1889a = LazyKt.b(new oj(j, str, 0));
        this.b = LazyKt.b(new oj(j2, str, 1));
    }

    @Override // androidx.compose.material3.SelectableDates
    public final boolean isSelectableDate(long j) {
        LocalDateTime localDateTimeB = KotlinDateTimeExtensionsKt.b(LocalDateTime.INSTANCE, j, this.c);
        Lazy lazy = this.f1889a;
        LocalDateTime localDateTime = (LocalDateTime) lazy.getValue();
        Lazy lazy2 = this.b;
        return (localDateTimeB.compareTo((LocalDateTime) lazy2.getValue()) <= 0 && localDateTimeB.compareTo(localDateTime) >= 0) || localDateTimeB.a().equals(((LocalDateTime) lazy.getValue()).a()) || localDateTimeB.a().equals(((LocalDateTime) lazy2.getValue()).a());
    }

    @Override // androidx.compose.material3.SelectableDates
    public final boolean isSelectableYear(int i) {
        return i <= ((LocalDateTime) this.b.getValue()).o() && ((LocalDateTime) this.f1889a.getValue()).o() <= i;
    }
}
