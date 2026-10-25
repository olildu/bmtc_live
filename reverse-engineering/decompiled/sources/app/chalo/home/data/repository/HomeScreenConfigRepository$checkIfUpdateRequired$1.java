package app.chalo.home.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.data.repository.HomeScreenConfigRepository", f = "HomeScreenConfigRepository.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "checkIfUpdateRequired", v = 1)
final class HomeScreenConfigRepository$checkIfUpdateRequired$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeScreenConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenConfigRepository$checkIfUpdateRequired$1(HomeScreenConfigRepository homeScreenConfigRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = homeScreenConfigRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
