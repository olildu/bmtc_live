package app.chalo.recent.model.app;

import defpackage.u01;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/recent/model/app/RecentsType;", "", "Companion", "Lapp/chalo/recent/model/app/RecentLocationPairAppModel;", "Lapp/chalo/recent/model/app/RecentPlaceAppModel;", "Lapp/chalo/recent/model/app/RecentRouteAppModel;", "Lapp/chalo/recent/model/app/RecentStopAppModel;", "Lapp/chalo/recent/model/app/RecentStopBasedTripAppModel;", "Lapp/chalo/recent/model/app/RecentTripAppModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class RecentsType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new u01(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9006a;
    public final String b;
    public final long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentsType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/model/app/RecentsType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RecentsType> serializer() {
            return (KSerializer) RecentsType.d.getValue();
        }
    }

    public RecentsType(long j, String str, String str2, int i) {
        this.f9006a = str;
        this.b = str2;
        this.c = j;
    }

    public static final /* synthetic */ void a(RecentsType recentsType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recentsType.f9006a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recentsType.b);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, recentsType.c);
    }

    public /* synthetic */ RecentsType(String str, String str2, long j) {
        this.f9006a = str;
        this.b = str2;
        this.c = j;
    }
}
