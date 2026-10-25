package app.chalo.capacitorDataMigration.models;

import app.chalo.capacitorDataMigration.dataFetcher.CapacitorDataFetchResult;
import defpackage.d;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/capacitorDataMigration/models/CapacitorMigrationResult;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CapacitorMigrationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1190a;
    public final CapacitorDataFetchResult b;
    public final Map c;
    public final List d;
    public final String e;

    public CapacitorMigrationResult(boolean z, CapacitorDataFetchResult capacitorDataFetchResult, Map migrationResults, ArrayList arrayList, String str) {
        Intrinsics.i(migrationResults, "migrationResults");
        this.f1190a = z;
        this.b = capacitorDataFetchResult;
        this.c = migrationResults;
        this.d = arrayList;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CapacitorMigrationResult)) {
            return false;
        }
        CapacitorMigrationResult capacitorMigrationResult = (CapacitorMigrationResult) obj;
        return this.f1190a == capacitorMigrationResult.f1190a && Intrinsics.d(this.b, capacitorMigrationResult.b) && Intrinsics.d(this.c, capacitorMigrationResult.c) && Intrinsics.d(this.d, capacitorMigrationResult.d) && Intrinsics.d(this.e, capacitorMigrationResult.e);
    }

    public final int hashCode() {
        int i = (this.f1190a ? 1231 : 1237) * 31;
        CapacitorDataFetchResult capacitorDataFetchResult = this.b;
        int iF = d.f(this.c, (i + (capacitorDataFetchResult == null ? 0 : capacitorDataFetchResult.hashCode())) * 31, 31);
        List list = this.d;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CapacitorMigrationResult(success=");
        sb.append(this.f1190a);
        sb.append(", extractionResult=");
        sb.append(this.b);
        sb.append(", migrationResults=");
        sb.append(this.c);
        sb.append(", migrationError=");
        sb.append(this.d);
        sb.append(", errorMessage=");
        return vo1.p(sb, this.e, ")");
    }

    public /* synthetic */ CapacitorMigrationResult(boolean z, CapacitorDataFetchResult capacitorDataFetchResult, Map map, String str, int i) {
        this(z, (i & 2) != 0 ? null : capacitorDataFetchResult, (i & 4) != 0 ? MapsKt.d() : map, (ArrayList) null, (i & 16) != 0 ? null : str);
    }
}
