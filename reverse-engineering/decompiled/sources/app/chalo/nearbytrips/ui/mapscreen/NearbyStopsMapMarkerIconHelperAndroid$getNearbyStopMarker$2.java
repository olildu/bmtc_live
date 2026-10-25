package app.chalo.nearbytrips.ui.mapscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.chalo.R;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.home.nearbytrips.ui.mapscreen.ZoomLevel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.utils.ResourceUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/compose/components/chalomap/PlatformMapMarkerBitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.nearbytrips.ui.mapscreen.NearbyStopsMapMarkerIconHelperAndroid$getNearbyStopMarker$2", f = "NearbyStopsMapMarkerIconHelper.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class NearbyStopsMapMarkerIconHelperAndroid$getNearbyStopMarker$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlatformMapMarkerBitmap>, Object> {
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $stopName;
    final /* synthetic */ ChaloTransitMode $transitMode;
    final /* synthetic */ float $zoom;
    int label;
    final /* synthetic */ NearbyStopsMapMarkerIconHelperAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapMarkerIconHelperAndroid$getNearbyStopMarker$2(NearbyStopsMapMarkerIconHelperAndroid nearbyStopsMapMarkerIconHelperAndroid, boolean z, ChaloTransitMode chaloTransitMode, float f, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nearbyStopsMapMarkerIconHelperAndroid;
        this.$isSelected = z;
        this.$transitMode = chaloTransitMode;
        this.$zoom = f;
        this.$stopName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyStopsMapMarkerIconHelperAndroid$getNearbyStopMarker$2(this.this$0, this.$isSelected, this.$transitMode, this.$zoom, this.$stopName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyStopsMapMarkerIconHelperAndroid$getNearbyStopMarker$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        NearbyStopsMapMarkerIconHelperAndroid nearbyStopsMapMarkerIconHelperAndroid = this.this$0;
        boolean z = this.$isSelected;
        ChaloTransitMode chaloTransitMode = this.$transitMode;
        float f = this.$zoom;
        String str = this.$stopName;
        View viewInflate = LayoutInflater.from(nearbyStopsMapMarkerIconHelperAndroid.f6450a).inflate(R.layout.stop_marker_with_title_view, (ViewGroup) null, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.stop_mode_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.stop_name_right);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.stop_name_left);
        ZoomLevel.INSTANCE.getClass();
        ZoomLevel zoomLevelA = ZoomLevel.Companion.a(f, chaloTransitMode);
        int[] iArr = NearbyStopsMapMarkerIconHelperAndroid.WhenMappings.f6451a;
        int i2 = iArr[zoomLevelA.ordinal()];
        if (i2 == 1) {
            i = z ? R.drawable.stop_max_zoom_out_selected : R.drawable.stop_max_zoom_out;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            switch (NearbyStopsMapMarkerIconHelperAndroid.WhenMappings.b[chaloTransitMode.ordinal()]) {
                case 1:
                    i = !z ? R.drawable.bus_nearby_unselected : R.drawable.bus_nearby_selected;
                    break;
                case 2:
                    i = !z ? R.drawable.train_nearby_unselected : R.drawable.train_nearby_selected;
                    break;
                case 3:
                    i = !z ? R.drawable.metro_nearby_unselected : R.drawable.metro_nearby_selected;
                    break;
                case 4:
                    i = !z ? R.drawable.monorail_nearby_unselected : R.drawable.monorail_nearby_selected;
                    break;
                case 5:
                    i = !z ? R.drawable.ferry_nearby_unselected : R.drawable.ferry_nearby_selected;
                    break;
                case 6:
                case 7:
                case 8:
                    i = !z ? R.drawable.bus_nearby_unselected : R.drawable.bus_nearby_selected;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        imageView.setImageResource(i);
        int i3 = iArr[zoomLevelA.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                Intrinsics.f(textView);
                textView.setVisibility(8);
                Intrinsics.f(textView2);
                textView2.setVisibility(8);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textView2.setText(str);
                textView.setText(str);
            }
        }
        return new PlatformMapMarkerBitmap(ResourceUtils.a(viewInflate));
    }
}
