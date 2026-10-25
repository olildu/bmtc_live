package app.chalo.compose.components.chalomap;

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
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapLiveBusMarkerHelper;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ContextExts;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapLiveBusMarkerHelperAndroid;", "Lapp/chalo/compose/components/chalomap/iconprovider/ChaloMapLiveBusMarkerHelper;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloMapLiveBusMarkerHelperAndroid implements ChaloMapLiveBusMarkerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1864a;
    public final StringProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapLiveBusMarkerHelperAndroid$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ChaloMapLiveBusMarkerHelperAndroid(Context context, StringProvider stringProvider) {
        Intrinsics.i(stringProvider, "stringProvider");
        this.f1864a = context;
        this.b = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x017c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.compose.components.chalomap.iconprovider.ChaloMapLiveBusMarkerHelper
    public final Object a(float f, LiveBusDelayedState liveBusDelayedState, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ChaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1 chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1;
        View viewInflate;
        ImageView imageView;
        ImageView imageView2;
        RelativeLayout.LayoutParams layoutParams;
        View view;
        final float f2;
        TextView textView;
        RelativeLayout.LayoutParams layoutParams2;
        BitmapDrawable bitmapDrawable;
        ImageView imageView3;
        if (continuationImpl instanceof ChaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1) {
            chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1 = (ChaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1) continuationImpl;
            int i = chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1 = new ChaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1(this, continuationImpl);
            }
        } else {
            chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1 = new ChaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1(this, continuationImpl);
        }
        Object obj = chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.label;
        Context context = this.f1864a;
        if (i2 == 0) {
            ResultKt.b(obj);
            viewInflate = LayoutInflater.from(context).inflate(R.layout.live_tracking_bus_icon_layout, (ViewGroup) null, false);
            Intrinsics.h(viewInflate, "inflate(...)");
            imageView = (ImageView) viewInflate.findViewById(R.id.bus_direction_icon);
            imageView2 = (ImageView) viewInflate.findViewById(R.id.bus_icon);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.info_layout);
            ImageView imageView4 = (ImageView) viewInflate.findViewById(R.id.info_icon);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.updated_time);
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (liveBusDelayedState instanceof LiveBusDelayedState.Delayed) {
                layoutParams.setMargins(0, (int) ContextExts.a(context, 30.0f), 0, 0);
                imageView2.setImageResource(R.drawable.live_bus2_delay);
                imageView.setImageResource(R.drawable.live_bus2_direction_delay);
                textView2.setVisibility(0);
                imageView4.setVisibility(0);
                linearLayout.setVisibility(0);
                textView2.setText("Updated\n" + String.valueOf(((LiveBusDelayedState.Delayed) liveBusDelayedState).f1877a) + " min ago");
            } else if (z) {
                layoutParams.setMargins(0, (int) ContextExts.a(context, 30.0f), 0, 0);
                imageView2.setImageResource(R.drawable.live_bus2);
                imageView.setImageResource(R.drawable.live_bus2_direction);
                textView2.setVisibility(0);
                imageView4.setVisibility(0);
                linearLayout.setVisibility(0);
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$0 = viewInflate;
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$1 = imageView;
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$2 = imageView2;
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$3 = layoutParams;
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$4 = textView2;
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.F$0 = f;
                z2 = z2;
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.Z$0 = z2;
                chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.label = 1;
                Object objB = this.b.b(StringEnum.HALTED, new Object[0], chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                view = viewInflate;
                f2 = f;
                textView = textView2;
                layoutParams2 = layoutParams;
                obj = objB;
            } else {
                layoutParams.setMargins(0, (int) ContextExts.a(context, 0.0f), 0, 0);
                imageView2.setImageResource(R.drawable.live_bus2);
                imageView.setImageResource(R.drawable.live_bus2_direction);
                textView2.setVisibility(8);
                imageView4.setVisibility(8);
                linearLayout.setVisibility(8);
            }
            f2 = f;
            imageView.setLayoutParams(layoutParams);
            imageView2.setLayoutParams(layoutParams);
            Drawable drawable = imageView.getDrawable();
            Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            final Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.h(bitmap, "getBitmap(...)");
            final Resources resources = context.getResources();
            bitmapDrawable = new BitmapDrawable(bitmap, f2, resources) { // from class: app.chalo.compose.components.chalomap.ChaloMapLiveBusMarkerHelperAndroidKt$getRotateDrawable$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Bitmap f1865a;
                public final /* synthetic */ float b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(resources, bitmap);
                    this.f1865a = bitmap;
                    this.b = f2;
                }

                @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    Intrinsics.i(canvas, "canvas");
                    canvas.save();
                    Bitmap bitmap2 = this.f1865a;
                    canvas.rotate(this.b, bitmap2.getWidth() / 2, bitmap2.getHeight() / 2);
                    super.draw(canvas);
                    canvas.restore();
                }
            };
            View viewFindViewById = viewInflate.findViewById(R.id.bus_direction_icon);
            Intrinsics.g(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            imageView3 = (ImageView) viewFindViewById;
            if (z2) {
                imageView3.setImageDrawable(bitmapDrawable);
            } else {
                imageView3.setVisibility(8);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            viewInflate.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredWidth = viewInflate.getMeasuredWidth();
            int measuredHeight = viewInflate.getMeasuredHeight();
            viewInflate.layout(0, 0, measuredWidth, measuredHeight);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Intrinsics.h(bitmapCreateBitmap, "createBitmap(...)");
            viewInflate.draw(new Canvas(bitmapCreateBitmap));
            return new PlatformMapMarkerBitmap(bitmapCreateBitmap);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z3 = chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.Z$0;
        f2 = chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.F$0;
        textView = (TextView) chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$4;
        layoutParams2 = (RelativeLayout.LayoutParams) chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$3;
        imageView2 = (ImageView) chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$2;
        imageView = (ImageView) chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$1;
        view = (View) chaloMapLiveBusMarkerHelperAndroid$getLiveBusMarker$1.L$0;
        ResultKt.b(obj);
        z2 = z3;
        textView.setText((CharSequence) obj);
        viewInflate = view;
        layoutParams = layoutParams2;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(layoutParams);
        Drawable drawable2 = imageView.getDrawable();
        Intrinsics.g(drawable2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        final Bitmap bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
        Intrinsics.h(bitmap2, "getBitmap(...)");
        final Resources resources2 = context.getResources();
        bitmapDrawable = new BitmapDrawable(bitmap2, f2, resources2) { // from class: app.chalo.compose.components.chalomap.ChaloMapLiveBusMarkerHelperAndroidKt$getRotateDrawable$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f1865a;
            public final /* synthetic */ float b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(resources2, bitmap2);
                this.f1865a = bitmap2;
                this.b = f2;
            }

            @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                Intrinsics.i(canvas, "canvas");
                canvas.save();
                Bitmap bitmap3 = this.f1865a;
                canvas.rotate(this.b, bitmap3.getWidth() / 2, bitmap3.getHeight() / 2);
                super.draw(canvas);
                canvas.restore();
            }
        };
        View viewFindViewById2 = viewInflate.findViewById(R.id.bus_direction_icon);
        Intrinsics.g(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        imageView3 = (ImageView) viewFindViewById2;
        if (z2) {
            imageView3.setImageDrawable(bitmapDrawable);
        } else {
            imageView3.setVisibility(8);
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        viewInflate.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
        int measuredWidth2 = viewInflate.getMeasuredWidth();
        int measuredHeight2 = viewInflate.getMeasuredHeight();
        viewInflate.layout(0, 0, measuredWidth2, measuredHeight2);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(measuredWidth2, measuredHeight2, Bitmap.Config.ARGB_8888);
        Intrinsics.h(bitmapCreateBitmap2, "createBitmap(...)");
        viewInflate.draw(new Canvas(bitmapCreateBitmap2));
        return new PlatformMapMarkerBitmap(bitmapCreateBitmap2);
    }
}
