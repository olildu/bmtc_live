package app.chalo.uistate.dialog;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.datetime.DatePeriod;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateJvmKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/MultiSelectDatePickerConfig;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiSelectDatePickerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10007a;
    public final int b;

    public MultiSelectDatePickerConfig(LocalDate localDate, int i, int i2) {
        IntRange intRange = new IntRange(0, i, 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.v(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (((IntProgressionIterator) it).c) {
            arrayList.add(LocalDateJvmKt.b(localDate, new DatePeriod(((IntIterator) it).nextInt(), 3)));
        }
        this.f10007a = arrayList;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSelectDatePickerConfig)) {
            return false;
        }
        MultiSelectDatePickerConfig multiSelectDatePickerConfig = (MultiSelectDatePickerConfig) obj;
        return Intrinsics.d(this.f10007a, multiSelectDatePickerConfig.f10007a) && this.b == multiSelectDatePickerConfig.b;
    }

    public final int hashCode() {
        return (this.f10007a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "MultiSelectDatePickerConfig(dates=" + this.f10007a + ", maxSelectableCount=" + this.b + ")";
    }
}
