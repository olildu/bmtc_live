package app.chalo.usecase;

import defpackage.ji;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/usecase/ChaloFeedbackConfigData;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloFeedbackConfigData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ji(24)), null};
    public static final FeedbackConfigDataForCity d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10153a;
    public final FeedbackConfigDataForCity b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usecase/ChaloFeedbackConfigData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usecase/ChaloFeedbackConfigData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloFeedbackConfigData> serializer() {
            return ChaloFeedbackConfigData$$serializer.f10154a;
        }
    }

    static {
        EmptyList emptyList = EmptyList.f17557a;
        d = new FeedbackConfigDataForCity(new FeedbackConfig(emptyList), new FeedbackConfig(emptyList));
    }

    public /* synthetic */ ChaloFeedbackConfigData(int i, List list, FeedbackConfigDataForCity feedbackConfigDataForCity) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.b(ChaloFeedbackConfigData$$serializer.f10154a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f10153a = null;
        } else {
            this.f10153a = list;
        }
        this.b = feedbackConfigDataForCity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloFeedbackConfigData)) {
            return false;
        }
        ChaloFeedbackConfigData chaloFeedbackConfigData = (ChaloFeedbackConfigData) obj;
        return Intrinsics.d(this.f10153a, chaloFeedbackConfigData.f10153a) && Intrinsics.d(this.b, chaloFeedbackConfigData.b);
    }

    public final int hashCode() {
        List list = this.f10153a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "ChaloFeedbackConfigData(citywiseConfig=" + this.f10153a + ", defaultConfig=" + this.b + ")";
    }
}
