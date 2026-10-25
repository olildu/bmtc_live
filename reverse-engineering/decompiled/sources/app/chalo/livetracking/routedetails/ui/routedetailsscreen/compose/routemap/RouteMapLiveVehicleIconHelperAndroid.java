package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import app.chalo.R;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteMapLiveVehicleIconHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ContextExts;
import app.chalo.utils.ResourceUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsscreen/compose/routemap/RouteMapLiveVehicleIconHelperAndroid;", "Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/RouteMapLiveVehicleIconHelper;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteMapLiveVehicleIconHelperAndroid implements RouteMapLiveVehicleIconHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4470a;
    public final CoroutineContextProvider b;
    public final StringProvider c;

    public RouteMapLiveVehicleIconHelperAndroid(Context context, CoroutineContextProvider coroutineContextProvider, StringProvider stringProvider) {
        Intrinsics.i(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.i(stringProvider, "stringProvider");
        this.f4470a = context;
        this.b = coroutineContextProvider;
        this.c = stringProvider;
        CoroutineScopeKt.a(coroutineContextProvider.a());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0171  */
    /* JADX WARN: Code duplicated, block: B:27:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object b(RouteMapLiveVehicleIconHelperAndroid routeMapLiveVehicleIconHelperAndroid, float f, Long l, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        RouteMapLiveVehicleIconHelperAndroid$getBusIconMarker$1 routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1;
        View viewInflate;
        ImageView imageView;
        ImageView imageView2;
        RelativeLayout.LayoutParams layoutParams;
        final float f2;
        boolean z3;
        View view;
        ImageView imageView3;
        TextView textView;
        RelativeLayout.LayoutParams layoutParams2;
        BitmapDrawable bitmapDrawable;
        ImageView imageView4;
        Context context = routeMapLiveVehicleIconHelperAndroid.f4470a;
        if (continuationImpl instanceof RouteMapLiveVehicleIconHelperAndroid$getBusIconMarker$1) {
            routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1 = (RouteMapLiveVehicleIconHelperAndroid$getBusIconMarker$1) continuationImpl;
            int i = routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.label = i - Integer.MIN_VALUE;
            } else {
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1 = new RouteMapLiveVehicleIconHelperAndroid$getBusIconMarker$1(routeMapLiveVehicleIconHelperAndroid, continuationImpl);
            }
        } else {
            routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1 = new RouteMapLiveVehicleIconHelperAndroid$getBusIconMarker$1(routeMapLiveVehicleIconHelperAndroid, continuationImpl);
        }
        Object obj = routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            viewInflate = LayoutInflater.from(context).inflate(R.layout.live_tracking_bus_icon_layout, (ViewGroup) null, false);
            Intrinsics.h(viewInflate, "inflate(...)");
            imageView = (ImageView) viewInflate.findViewById(R.id.bus_direction_icon);
            imageView2 = (ImageView) viewInflate.findViewById(R.id.bus_icon);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.info_layout);
            ImageView imageView5 = (ImageView) viewInflate.findViewById(R.id.info_icon);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.updated_time);
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (l != null) {
                layoutParams.setMargins(0, (int) ContextExts.a(context, 30.0f), 0, 0);
                imageView2.setImageResource(R.drawable.live_bus2_delay);
                imageView.setImageResource(R.drawable.live_bus2_direction_delay);
                textView2.setVisibility(0);
                imageView5.setVisibility(0);
                linearLayout.setVisibility(0);
                textView2.setText("Updated\n" + l.longValue() + " min ago");
                f2 = f;
                z3 = z2;
            } else if (z) {
                layoutParams.setMargins(0, (int) ContextExts.a(context, 30.0f), 0, 0);
                imageView2.setImageResource(R.drawable.live_bus2);
                imageView.setImageResource(R.drawable.live_bus2_direction);
                textView2.setVisibility(0);
                imageView5.setVisibility(0);
                linearLayout.setVisibility(0);
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$0 = viewInflate;
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$1 = imageView;
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$2 = imageView2;
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$3 = layoutParams;
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$4 = textView2;
                f2 = f;
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.F$0 = f2;
                z3 = z2;
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.Z$0 = z3;
                routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.label = 1;
                Object objB = routeMapLiveVehicleIconHelperAndroid.c.b(StringEnum.HALTED, new Object[0], routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                view = viewInflate;
                imageView3 = imageView;
                textView = textView2;
                layoutParams2 = layoutParams;
                obj = objB;
            } else {
                f2 = f;
                z3 = z2;
                layoutParams.setMargins(0, (int) ContextExts.a(context, 0.0f), 0, 0);
                imageView2.setImageResource(R.drawable.live_bus2);
                imageView.setImageResource(R.drawable.live_bus2_direction);
                textView2.setVisibility(8);
                imageView5.setVisibility(8);
                linearLayout.setVisibility(8);
            }
            imageView.setLayoutParams(layoutParams);
            imageView2.setLayoutParams(layoutParams);
            Drawable drawable = imageView.getDrawable();
            Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            final Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.h(bitmap, "getBitmap(...)");
            final Resources resources = context.getResources();
            bitmapDrawable = new BitmapDrawable(bitmap, f2, resources) { // from class: app.chalo.utils.ResourceUtils$getRotateDrawable$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Bitmap f10438a;
                public final /* synthetic */ float b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(resources, bitmap);
                    this.f10438a = bitmap;
                    this.b = f2;
                }

                @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    Intrinsics.i(canvas, "canvas");
                    canvas.save();
                    Bitmap bitmap2 = this.f10438a;
                    canvas.rotate(this.b, bitmap2.getWidth() / 2, bitmap2.getHeight() / 2);
                    super.draw(canvas);
                    canvas.restore();
                }
            };
            View viewFindViewById = viewInflate.findViewById(R.id.bus_direction_icon);
            Intrinsics.g(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            imageView4 = (ImageView) viewFindViewById;
            if (z3) {
                imageView4.setImageDrawable(bitmapDrawable);
            } else {
                imageView4.setVisibility(8);
            }
            return new PlatformMapMarkerBitmap(ResourceUtils.a(viewInflate));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z4 = routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.Z$0;
        float f3 = routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.F$0;
        textView = (TextView) routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$4;
        layoutParams2 = (RelativeLayout.LayoutParams) routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$3;
        imageView2 = (ImageView) routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$2;
        imageView3 = (ImageView) routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$1;
        view = (View) routeMapLiveVehicleIconHelperAndroid$getBusIconMarker$1.L$0;
        ResultKt.b(obj);
        z3 = z4;
        f2 = f3;
        textView.setText((CharSequence) obj);
        viewInflate = view;
        layoutParams = layoutParams2;
        imageView = imageView3;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(layoutParams);
        Drawable drawable2 = imageView.getDrawable();
        Intrinsics.g(drawable2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        final Bitmap bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
        Intrinsics.h(bitmap2, "getBitmap(...)");
        final Resources resources2 = context.getResources();
        bitmapDrawable = new BitmapDrawable(bitmap2, f2, resources2) { // from class: app.chalo.utils.ResourceUtils$getRotateDrawable$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f10438a;
            public final /* synthetic */ float b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(resources2, bitmap2);
                this.f10438a = bitmap2;
                this.b = f2;
            }

            @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                Intrinsics.i(canvas, "canvas");
                canvas.save();
                Bitmap bitmap3 = this.f10438a;
                canvas.rotate(this.b, bitmap3.getWidth() / 2, bitmap3.getHeight() / 2);
                super.draw(canvas);
                canvas.restore();
            }
        };
        View viewFindViewById2 = viewInflate.findViewById(R.id.bus_direction_icon);
        Intrinsics.g(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        imageView4 = (ImageView) viewFindViewById2;
        if (z3) {
            imageView4.setImageDrawable(bitmapDrawable);
        } else {
            imageView4.setVisibility(8);
        }
        return new PlatformMapMarkerBitmap(ResourceUtils.a(viewInflate));
    }

    @Override // app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteMapLiveVehicleIconHelper
    public final Object a(boolean z, Long l, boolean z2, Float f, ContinuationImpl continuationImpl) {
        return BuildersKt.g(this.b.a(), new RouteMapLiveVehicleIconHelperAndroid$getUpdatedMarker$2(this, f, l, z, z2, null), continuationImpl);
    }
}
