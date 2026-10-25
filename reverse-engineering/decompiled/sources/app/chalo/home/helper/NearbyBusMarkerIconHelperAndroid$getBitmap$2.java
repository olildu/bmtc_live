package app.chalo.home.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import app.chalo.R;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.models.RealTimeRouteInfo;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/compose/components/chalomap/PlatformMapMarkerBitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.helper.NearbyBusMarkerIconHelperAndroid$getBitmap$2", f = "NearbyBusMarkerIconHelperAndroid.kt", l = {107}, m = "invokeSuspend", v = 1)
final class NearbyBusMarkerIconHelperAndroid$getBitmap$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlatformMapMarkerBitmap>, Object> {
    final /* synthetic */ boolean $isCityRouteNameDisabled;
    final /* synthetic */ boolean $isCurrentCityKochi;
    final /* synthetic */ boolean $isDebugBuild;
    final /* synthetic */ ChaloTransitMode $mode;
    final /* synthetic */ RealTimeRouteInfo.GeoRealTimeInfo $realTimeInfo;
    int label;
    final /* synthetic */ NearbyBusMarkerIconHelperAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyBusMarkerIconHelperAndroid$getBitmap$2(NearbyBusMarkerIconHelperAndroid nearbyBusMarkerIconHelperAndroid, ChaloTransitMode chaloTransitMode, RealTimeRouteInfo.GeoRealTimeInfo geoRealTimeInfo, boolean z, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nearbyBusMarkerIconHelperAndroid;
        this.$mode = chaloTransitMode;
        this.$realTimeInfo = geoRealTimeInfo;
        this.$isCityRouteNameDisabled = z;
        this.$isCurrentCityKochi = z2;
        this.$isDebugBuild = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyBusMarkerIconHelperAndroid$getBitmap$2(this.this$0, this.$mode, this.$realTimeInfo, this.$isCityRouteNameDisabled, this.$isCurrentCityKochi, this.$isDebugBuild, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyBusMarkerIconHelperAndroid$getBitmap$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[PHI: r2
      0x006b: PHI (r2v9 android.graphics.Bitmap) = (r2v6 android.graphics.Bitmap), (r2v12 android.graphics.Bitmap) binds: [B:35:0x0080, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapDecodeResource;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Bitmap bitmapB = this.this$0;
        ChaloTransitMode chaloTransitMode = this.$mode;
        RealTimeRouteInfo.GeoRealTimeInfo geoRealTimeInfo = this.$realTimeInfo;
        boolean z = this.$isCityRouteNameDisabled;
        boolean z2 = this.$isCurrentCityKochi;
        boolean z3 = this.$isDebugBuild;
        this.label = 1;
        Context context = bitmapB.f3105a;
        try {
            if (chaloTransitMode == ChaloTransitMode.METRO || chaloTransitMode == ChaloTransitMode.TRAIN || chaloTransitMode == ChaloTransitMode.MONORAIL) {
                bitmapB = NearbyBusMarkerIconHelperAndroid.b(chaloTransitMode, geoRealTimeInfo.e + " - " + geoRealTimeInfo.f, context);
            } else if (z2 || z) {
                int i2 = NearbyBusMarkerIconHelperAndroid.WhenMappings.f3106a[chaloTransitMode.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 && (bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.live_bg_ferry)) != null) {
                        bitmapB = bitmapDecodeResource;
                    } else {
                        bitmapB = NearbyBusMarkerIconHelperAndroid.b(chaloTransitMode, geoRealTimeInfo.d, context);
                    }
                } else if (z3) {
                    bitmapB = NearbyBusMarkerIconHelperAndroid.b(chaloTransitMode, geoRealTimeInfo.i, context);
                } else {
                    bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.live_bg_bus_icon);
                    if (bitmapDecodeResource == null) {
                        bitmapB = NearbyBusMarkerIconHelperAndroid.b(chaloTransitMode, geoRealTimeInfo.d, context);
                    } else {
                        bitmapB = bitmapDecodeResource;
                    }
                }
            } else {
                bitmapB = NearbyBusMarkerIconHelperAndroid.b(chaloTransitMode, geoRealTimeInfo.d, context);
            }
        } catch (Exception e) {
            bitmapB.c.i(e);
            bitmapB = NearbyBusMarkerIconHelperAndroid.b(chaloTransitMode, geoRealTimeInfo.d, context);
        }
        PlatformMapMarkerBitmap platformMapMarkerBitmap = new PlatformMapMarkerBitmap(bitmapB);
        return platformMapMarkerBitmap == coroutineSingletons ? coroutineSingletons : platformMapMarkerBitmap;
    }
}
