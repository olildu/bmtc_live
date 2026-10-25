package app.chalo.geoquery.data.models.api;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestReportProblem;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GeoQueryApiRequestReportProblem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2801a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestReportProblem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestReportProblem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEFAULT_VERSION_CODE", "Ljava/lang/String;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GeoQueryApiRequestReportProblem> serializer() {
            return GeoQueryApiRequestReportProblem$$serializer.f2802a;
        }
    }

    public /* synthetic */ GeoQueryApiRequestReportProblem(int i, String str) {
        if (1 == (i & 1)) {
            this.f2801a = str;
        } else {
            PluginExceptionsKt.b(GeoQueryApiRequestReportProblem$$serializer.f2802a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GeoQueryApiRequestReportProblem) && Intrinsics.d(this.f2801a, ((GeoQueryApiRequestReportProblem) obj).f2801a);
    }

    public final int hashCode() {
        return this.f2801a.hashCode();
    }

    public final String toString() {
        return vo1.B("GeoQueryApiRequestReportProblem(cachedVersionCode=", this.f2801a, ")");
    }

    public GeoQueryApiRequestReportProblem(String cachedVersionCode) {
        Intrinsics.i(cachedVersionCode, "cachedVersionCode");
        this.f2801a = cachedVersionCode;
    }
}
