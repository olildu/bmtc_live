package app.chalo.home.ui.base;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent", f = "HomeComponent.kt", l = {2063, 2064, 2065, 2066, 2072, 2073, 2077, 2078, 2081, 2082, 2092, 2093, 2094, 2095, 2102, 2103, 2107, 2108, 2115, 2119, 2120, 2127, 2128, 2135, 2136, 2137, 2138, 2148, 2150, 2151, 2152, 2153}, m = "createBottomSheetDataAndUpdateState", v = 1)
final class HomeComponent$createBottomSheetDataAndUpdateState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$createBottomSheetDataAndUpdateState$1(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HomeComponent.H0(this.this$0, null, this);
    }
}
