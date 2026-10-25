package app.cash.sqldelight;

import java.lang.Enum;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lapp/cash/sqldelight/EnumColumnAdapter;", "", "T", "Lapp/cash/sqldelight/ColumnAdapter;", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnumColumnAdapter<T extends Enum<T>> implements ColumnAdapter<T, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f698a;

    public EnumColumnAdapter(Enum[] enumValues) {
        Intrinsics.i(enumValues, "enumValues");
        this.f698a = enumValues;
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object a(String str) {
        for (Enum r3 : this.f698a) {
            if (Intrinsics.d(r3.name(), str)) {
                return r3;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object encode(Object obj) {
        Enum value = (Enum) obj;
        Intrinsics.i(value, "value");
        return value.name();
    }
}
