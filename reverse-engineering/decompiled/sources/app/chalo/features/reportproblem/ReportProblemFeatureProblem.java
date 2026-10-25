package app.chalo.features.reportproblem;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
import defpackage.x11;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/reportproblem/ReportProblemFeatureProblem;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ReportProblemFeatureProblem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new x11(13)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2762a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/reportproblem/ReportProblemFeatureProblem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/reportproblem/ReportProblemFeatureProblem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ReportProblemFeatureProblem> serializer() {
            return ReportProblemFeatureProblem$$serializer.f2763a;
        }
    }

    public /* synthetic */ ReportProblemFeatureProblem(int i, String str, String str2, String str3, String str4, List list) {
        if (23 != (i & 23)) {
            PluginExceptionsKt.b(ReportProblemFeatureProblem$$serializer.f2763a.getDescriptor(), i, 23);
            throw null;
        }
        this.f2762a = str;
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemFeatureProblem)) {
            return false;
        }
        ReportProblemFeatureProblem reportProblemFeatureProblem = (ReportProblemFeatureProblem) obj;
        return Intrinsics.d(this.f2762a, reportProblemFeatureProblem.f2762a) && Intrinsics.d(this.b, reportProblemFeatureProblem.b) && Intrinsics.d(this.c, reportProblemFeatureProblem.c) && Intrinsics.d(this.d, reportProblemFeatureProblem.d) && Intrinsics.d(this.e, reportProblemFeatureProblem.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nf1.e(r30.b(nf1.e(this.f2762a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ReportProblemFeatureProblem(problemId=", this.f2762a, ", problemCopy=", this.b, ", ctaTagList=");
        cb0.s(", chatGroupTag=", this.d, ", ctaType=", sbE, this.c);
        return vo1.p(sbE, this.e, ")");
    }

    public ReportProblemFeatureProblem(String str, String problemCopy, String chatGroupTag, String ctaType, List ctaTagList) {
        Intrinsics.i(problemCopy, "problemCopy");
        Intrinsics.i(ctaTagList, "ctaTagList");
        Intrinsics.i(chatGroupTag, "chatGroupTag");
        Intrinsics.i(ctaType, "ctaType");
        this.f2762a = str;
        this.b = problemCopy;
        this.c = ctaTagList;
        this.d = chatGroupTag;
        this.e = ctaType;
    }
}
