package app.chalo.usecase;

import androidx.compose.material3.internal.CalendarModelKt;
import defpackage.a30;
import defpackage.nf1;
import defpackage.r30;
import defpackage.uf0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usecase/FeedbackData;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FeedbackData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f10169a;
    public final String b;
    public final List c;
    public final boolean d;
    public final long e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usecase/FeedbackData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usecase/FeedbackData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FeedbackData> serializer() {
            return FeedbackData$$serializer.f10170a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a30(12)), null, LazyKt.a(lazyThreadSafetyMode, new a30(13)), null, null};
    }

    public FeedbackData(Pair pair, String title, List feedbackTags, boolean z) {
        Intrinsics.i(title, "title");
        Intrinsics.i(feedbackTags, "feedbackTags");
        this.f10169a = pair;
        this.b = title;
        this.c = feedbackTags;
        this.d = z;
        this.e = CalendarModelKt.MillisecondsIn24Hours;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackData)) {
            return false;
        }
        FeedbackData feedbackData = (FeedbackData) obj;
        return Intrinsics.d(this.f10169a, feedbackData.f10169a) && Intrinsics.d(this.b, feedbackData.b) && Intrinsics.d(this.c, feedbackData.c) && this.d == feedbackData.d && this.e == feedbackData.e;
    }

    public final int hashCode() {
        int iB = (r30.b(nf1.e(this.f10169a.hashCode() * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31;
        long j = this.e;
        return iB + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackData(ratingRange=");
        sb.append(this.f10169a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", feedbackTags=");
        sb.append(this.c);
        sb.append(", requireTextFeedback=");
        sb.append(this.d);
        sb.append(", feedbackTimeout=");
        return uf0.m(this.e, ")", sb);
    }

    public /* synthetic */ FeedbackData(int i, Pair pair, String str, List list, boolean z, long j) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(FeedbackData$$serializer.f10170a.getDescriptor(), i, 15);
            throw null;
        }
        this.f10169a = pair;
        this.b = str;
        this.c = list;
        this.d = z;
        if ((i & 16) == 0) {
            this.e = CalendarModelKt.MillisecondsIn24Hours;
        } else {
            this.e = j;
        }
    }
}
