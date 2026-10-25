package app.chalo.home.nearbytrips.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase", f = "NearbyTripsDataManagerBase.kt", l = {EACTags.APPLICATION_IMAGE}, m = "fetchNearbyTripsAsync", v = 1)
final class NearbyTripsDataManagerBase$fetchNearbyTripsAsync$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NearbyTripsDataManagerBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyTripsDataManagerBase$fetchNearbyTripsAsync$1(NearbyTripsDataManagerBase nearbyTripsDataManagerBase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nearbyTripsDataManagerBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0, null, false, false, 0.0d, this);
    }
}
