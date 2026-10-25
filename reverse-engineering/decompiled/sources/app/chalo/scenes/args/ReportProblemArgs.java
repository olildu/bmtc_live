package app.chalo.scenes.args;

import app.chalo.features.reportproblem.ReportProblemCollection;
import app.chalo.scenes.ChaloScenes;
import defpackage.d;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.x11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/ReportProblemArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ReportProblemArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;
    public final ReportProblemCollection b;
    public final String c;
    public final Map d;
    public final List e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/ReportProblemArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/ReportProblemArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ReportProblemArgs> serializer() {
            return ReportProblemArgs$$serializer.f9300a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new x11(9)), LazyKt.a(lazyThreadSafetyMode, new x11(10)), null};
    }

    public /* synthetic */ ReportProblemArgs(int i, ReportProblemCollection reportProblemCollection, String str, Map map, List list, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ReportProblemArgs$$serializer.f9300a.getDescriptor(), i, 7);
            throw null;
        }
        this.b = reportProblemCollection;
        this.c = str;
        this.d = map;
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.ReportProblem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemArgs)) {
            return false;
        }
        ReportProblemArgs reportProblemArgs = (ReportProblemArgs) obj;
        return Intrinsics.d(this.b, reportProblemArgs.b) && Intrinsics.d(this.c, reportProblemArgs.c) && Intrinsics.d(this.d, reportProblemArgs.d) && Intrinsics.d(this.e, reportProblemArgs.e) && Intrinsics.d(this.f, reportProblemArgs.f);
    }

    public final int hashCode() {
        ReportProblemCollection reportProblemCollection = this.b;
        int iF = d.f(this.d, nf1.e((reportProblemCollection == null ? 0 : reportProblemCollection.hashCode()) * 31, 31, this.c), 31);
        List list = this.e;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportProblemArgs(problemCollection=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", userPropertiesMap=");
        sb.append(this.d);
        sb.append(", additionalProblemCategoryList=");
        sb.append(this.e);
        sb.append(", supportContactNumber=");
        return vo1.p(sb, this.f, ")");
    }

    public ReportProblemArgs(ReportProblemCollection reportProblemCollection, String source, Map userPropertiesMap, ArrayList arrayList, String str) {
        Intrinsics.i(source, "source");
        Intrinsics.i(userPropertiesMap, "userPropertiesMap");
        this.b = reportProblemCollection;
        this.c = source;
        this.d = userPropertiesMap;
        this.e = arrayList;
        this.f = str;
    }
}
