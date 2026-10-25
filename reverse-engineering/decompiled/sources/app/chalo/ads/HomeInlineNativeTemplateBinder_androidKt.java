package app.chalo.ads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import app.chalo.R;
import app.chalo.ads.HomeInlineNativeTemplateBinder_androidKt;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeInlineNativeTemplateBinder_androidKt {
    public static final void a(final Context context, final FrameLayout mediaContainer, final HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig, final Float f, final String logContext, final String str) {
        Integer num;
        Intrinsics.i(context, "context");
        Intrinsics.i(mediaContainer, "mediaContainer");
        Intrinsics.i(logContext, "logContext");
        if (homeInlineTemplateLayoutConfig.d && (num = homeInlineTemplateLayoutConfig.c) != null) {
            final int iIntValue = num.intValue();
            ViewParent parent = mediaContainer.getParent();
            Integer numValueOf = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                int width = viewGroup.getWidth();
                Integer numValueOf2 = Integer.valueOf(width);
                if (width <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    numValueOf = Integer.valueOf(MathKt.f(numValueOf2.intValue() / context.getResources().getDisplayMetrics().density));
                }
            }
            Integer num2 = numValueOf;
            b(homeInlineTemplateLayoutConfig, f, iIntValue, context, mediaContainer, logContext, str, num2);
            if (num2 == null || num2.intValue() == 0) {
                mediaContainer.post(new Runnable() { // from class: y70
                    @Override // java.lang.Runnable
                    public final void run() {
                        FrameLayout frameLayout = mediaContainer;
                        ViewParent parent2 = frameLayout.getParent();
                        Integer numValueOf3 = null;
                        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                        Context context2 = context;
                        if (viewGroup2 != null) {
                            int width2 = viewGroup2.getWidth();
                            Integer numValueOf4 = Integer.valueOf(width2);
                            if (width2 <= 0) {
                                numValueOf4 = null;
                            }
                            if (numValueOf4 != null) {
                                numValueOf3 = Integer.valueOf(MathKt.f(numValueOf4.intValue() / context2.getResources().getDisplayMetrics().density));
                            }
                        }
                        HomeInlineNativeTemplateBinder_androidKt.b(homeInlineTemplateLayoutConfig, f, iIntValue, context2, frameLayout, logContext, str, numValueOf3);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    public static final void b(HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig, Float f, int i, Context context, FrameLayout frameLayout, String str, String str2, Integer num) {
        Integer numValueOf;
        Float f2;
        String strValueOf;
        Float f3 = homeInlineTemplateLayoutConfig.h;
        if (f3 == null) {
            numValueOf = null;
        } else {
            if (f3.floatValue() <= 0.0f || num == null || num.intValue() <= 0) {
                f3 = null;
            }
            if (f3 != null) {
                float fFloatValue = f3.floatValue();
                Intrinsics.f(num);
                int iF = MathKt.f(num.intValue() * fFloatValue);
                if (iF < 1) {
                    iF = 1;
                }
                numValueOf = Integer.valueOf(iF);
            } else {
                numValueOf = null;
            }
        }
        Integer num2 = homeInlineTemplateLayoutConfig.g;
        if (f != null) {
            float fFloatValue2 = f.floatValue();
            if (Math.abs(fFloatValue2) > Float.MAX_VALUE || fFloatValue2 <= 0.0f) {
                f2 = null;
            } else {
                f2 = f;
            }
        } else {
            f2 = null;
        }
        if (f2 != null) {
            i = MathKt.f(f2.floatValue() * i);
        }
        if (num2 != null) {
            i = Math.max(i, num2.intValue());
        }
        if (numValueOf != null) {
            Integer num3 = numValueOf.intValue() > 0 ? numValueOf : null;
            if (num3 != null) {
                i = Math.min(i, num3.intValue());
            }
        }
        if (i < 1) {
            i = 1;
        }
        int iF2 = MathKt.f(i * context.getResources().getDisplayMetrics().density);
        int i2 = iF2 >= 1 ? iF2 : 1;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (layoutParams.width != i2) {
            layoutParams.width = i2;
            frameLayout.setLayoutParams(layoutParams);
        }
        if (f == null || (strValueOf = String.valueOf(f.floatValue())) == null) {
            strValueOf = "null";
        }
        int iIntValue = num != null ? num.intValue() : -1;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" templateMediaWidth ratio=");
        sb.append(strValueOf);
        z40.o(i, i2, " widthDp=", " widthPx=", sb);
        sb.append(" parentWidthDp=");
        sb.append(iIntValue);
        String message = sb.toString();
        Intrinsics.i(message, "message");
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01fb  */
    public static final HomeInlineTemplateBindResult c(Context context, ViewGroup container, HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig, HomeInlineTemplateContent homeInlineTemplateContent, Function1 function1, Function1 function2, Function1 function3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.i(context, "context");
        Intrinsics.i(container, "container");
        int i8 = homeInlineTemplateLayoutConfig.f787a;
        boolean z = homeInlineTemplateContent.e;
        Object tag = container.getTag(R.id.ad_media_container);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num == null || num.intValue() != i8 || container.getChildCount() == 0) {
            container.removeAllViews();
            LayoutInflater.from(context).inflate(i8, container, true);
            container.setTag(R.id.ad_media_container, Integer.valueOf(i8));
        }
        View childAt = container.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return new HomeInlineTemplateBindResult(false, null, false, homeInlineTemplateContent.e, 0);
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.ad_headline);
        if (textView == null) {
            return new HomeInlineTemplateBindResult(false, null, false, homeInlineTemplateContent.e, 0);
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.ad_body);
        if (textView2 == null) {
            return new HomeInlineTemplateBindResult(false, null, false, homeInlineTemplateContent.e, 0);
        }
        RatingBar ratingBar = (RatingBar) viewGroup.findViewById(R.id.ad_rating);
        if (ratingBar == null) {
            return new HomeInlineTemplateBindResult(false, null, false, homeInlineTemplateContent.e, 0);
        }
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.ad_cta);
        if (textView3 == null) {
            return new HomeInlineTemplateBindResult(false, null, false, homeInlineTemplateContent.e, 0);
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.ad_icon);
        if (imageView == null) {
            return new HomeInlineTemplateBindResult(false, null, false, homeInlineTemplateContent.e, 0);
        }
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.ad_choice);
        if (imageView2 == null) {
            return new HomeInlineTemplateBindResult(false, null, false, homeInlineTemplateContent.e, 0);
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.ad_media_container);
        textView.setText(homeInlineTemplateContent.f786a);
        String strA = homeInlineTemplateContent.b;
        if (homeInlineTemplateLayoutConfig.e) {
            strA = vo1.A(strA, "  ›");
        }
        textView3.setText(strA);
        Float f = homeInlineTemplateContent.d;
        if (f == null || f.floatValue() <= 0.0f) {
            f = null;
        }
        String str = homeInlineTemplateContent.c;
        if (str == null) {
            str = "";
        }
        String string = StringsKt.u0(str).toString();
        boolean z2 = homeInlineTemplateLayoutConfig.f;
        boolean z3 = z2 && f != null;
        boolean z4 = z2 && !StringsKt.F(string);
        if (z3) {
            ratingBar.setVisibility(0);
            Intrinsics.f(f);
            ratingBar.setRating(RangesKt.d(f.floatValue(), 0.0f, 5.0f));
            i = 8;
            textView2.setVisibility(8);
            i2 = 0;
        } else {
            i = 8;
            if (z4) {
                ratingBar.setVisibility(8);
                i2 = 0;
                textView2.setVisibility(0);
                textView2.setText(string);
            } else {
                i2 = 0;
                ratingBar.setVisibility(8);
                textView2.setVisibility(8);
            }
        }
        if (z) {
            imageView.setVisibility(i2);
            function1.invoke(imageView);
        } else {
            imageView.setImageDrawable(null);
            imageView.setVisibility(i);
        }
        function2.invoke(imageView2);
        boolean z5 = z3 || z4;
        if (i8 == R.layout.adster_unified_native_home_inline_wide) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                imageView2 = imageView2;
            } else {
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 == null) {
                    imageView2 = imageView2;
                } else {
                    ViewGroup.LayoutParams layoutParams5 = ratingBar.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams6 = layoutParams5 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams5 : null;
                    if (layoutParams6 == null) {
                        imageView2 = imageView2;
                    } else {
                        ViewGroup.LayoutParams layoutParams7 = textView3.getLayoutParams();
                        ConstraintLayout.LayoutParams layoutParams8 = layoutParams7 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams7 : null;
                        if (layoutParams8 == null) {
                            imageView2 = imageView2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                            ((ViewGroup.MarginLayoutParams) layoutParams8).height = -2;
                            textView.setGravity(GravityCompat.START);
                            textView3.setGravity(GravityCompat.START);
                            textView.setIncludeFontPadding(true);
                            textView3.setIncludeFontPadding(true);
                            textView.setTranslationY(0.0f);
                            textView3.setTranslationY(0.0f);
                            if (z) {
                                layoutParams2.startToEnd = R.id.ad_icon;
                                layoutParams2.startToStart = -1;
                                layoutParams2.setMarginStart(d(context, 12));
                                int i9 = R.id.ad_icon;
                                layoutParams4.bottomToBottom = i9;
                                i7 = -1;
                                layoutParams4.bottomToTop = -1;
                                layoutParams6.bottomToBottom = i9;
                                layoutParams6.bottomToTop = -1;
                                layoutParams8.topToTop = i9;
                                layoutParams8.topToBottom = -1;
                                layoutParams8.bottomToBottom = i9;
                                layoutParams8.bottomToTop = -1;
                            } else {
                                layoutParams2.startToEnd = -1;
                                layoutParams2.startToStart = 0;
                                layoutParams2.setMarginStart(d(context, 12));
                                layoutParams4.bottomToBottom = 0;
                                layoutParams4.bottomToTop = -1;
                                layoutParams6.bottomToBottom = 0;
                                layoutParams6.bottomToTop = -1;
                                layoutParams8.topToTop = -1;
                                layoutParams8.topToBottom = R.id.ad_media_container;
                                layoutParams8.bottomToBottom = 0;
                                i7 = -1;
                                layoutParams8.bottomToTop = -1;
                            }
                            if (!z5) {
                                if (z) {
                                    int i10 = R.id.ad_icon;
                                    layoutParams2.topToTop = i10;
                                    layoutParams2.topToBottom = i7;
                                    layoutParams2.bottomToBottom = i10;
                                    layoutParams2.bottomToTop = i7;
                                } else {
                                    layoutParams2.topToTop = i7;
                                    layoutParams2.topToBottom = R.id.ad_media_container;
                                    layoutParams2.bottomToBottom = 0;
                                    layoutParams2.bottomToTop = i7;
                                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                                    layoutParams2.matchConstraintDefaultHeight = 0;
                                    textView.setGravity(8388627);
                                    ((ViewGroup.MarginLayoutParams) layoutParams8).height = 0;
                                    layoutParams8.matchConstraintDefaultHeight = 0;
                                    textView3.setGravity(8388629);
                                }
                                layoutParams2.verticalBias = 0.5f;
                                float fD = d(context, 2);
                                textView.setTranslationY(fD);
                                textView3.setTranslationY(fD);
                            } else if (z) {
                                layoutParams2.topToTop = R.id.ad_icon;
                                layoutParams2.topToBottom = i7;
                                layoutParams2.bottomToBottom = i7;
                                layoutParams2.bottomToTop = i7;
                            } else {
                                layoutParams2.topToTop = i7;
                                layoutParams2.topToBottom = R.id.ad_media_container;
                                layoutParams2.bottomToBottom = i7;
                                layoutParams2.bottomToTop = i7;
                                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = d(context, 8);
                            }
                            textView.setLayoutParams(layoutParams2);
                            textView2.setLayoutParams(layoutParams4);
                            ratingBar.setLayoutParams(layoutParams6);
                            textView3.setLayoutParams(layoutParams8);
                        }
                    }
                }
            }
        } else {
            imageView2 = imageView2;
            if (i8 == R.layout.adster_unified_native_home_inline_split) {
                ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams10 = layoutParams9 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams9 : null;
                if (layoutParams10 != null) {
                    ViewGroup.LayoutParams layoutParams11 = textView3.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams12 = layoutParams11 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams11 : null;
                    if (layoutParams12 != null) {
                        if (z) {
                            int i11 = R.id.ad_icon;
                            layoutParams10.startToStart = i11;
                            i5 = -1;
                            layoutParams10.startToEnd = -1;
                            layoutParams12.startToStart = i11;
                            layoutParams12.startToEnd = -1;
                            i6 = 8;
                        } else {
                            i5 = -1;
                            layoutParams10.startToStart = -1;
                            layoutParams10.startToEnd = R.id.ad_media_container;
                            i6 = 8;
                            layoutParams10.setMarginStart(d(context, 8));
                            layoutParams12.startToStart = -1;
                            layoutParams12.startToEnd = R.id.ad_media_container;
                            layoutParams12.setMarginStart(d(context, 8));
                        }
                        if (z5 || z) {
                            layoutParams10.topToTop = i5;
                            if (z) {
                                layoutParams10.topToBottom = R.id.ad_icon;
                            } else {
                                layoutParams10.topToBottom = i5;
                                layoutParams10.topToTop = 0;
                                ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = d(context, 8);
                            }
                            layoutParams10.bottomToBottom = i5;
                            layoutParams10.bottomToTop = i5;
                        } else {
                            layoutParams10.topToTop = 0;
                            layoutParams10.topToBottom = i5;
                            layoutParams10.bottomToBottom = i5;
                            layoutParams10.bottomToTop = i5;
                            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = d(context, i6);
                            layoutParams10.verticalBias = 0.0f;
                        }
                        textView.setLayoutParams(layoutParams10);
                        textView3.setLayoutParams(layoutParams12);
                    }
                }
            } else if (i8 == R.layout.adster_unified_native_medium_fixed_height) {
                ViewGroup.LayoutParams layoutParams13 = textView.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams14 = layoutParams13 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams13 : null;
                if (layoutParams14 != null) {
                    ViewGroup.LayoutParams layoutParams15 = textView3.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams16 = layoutParams15 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams15 : null;
                    if (layoutParams16 != null) {
                        if (z) {
                            layoutParams14.startToStart = R.id.ad_icon;
                            i3 = -1;
                            layoutParams14.startToEnd = -1;
                            layoutParams14.setMarginStart(0);
                            layoutParams16.startToStart = R.id.ad_icon;
                            layoutParams16.startToEnd = -1;
                            layoutParams16.setMarginStart(0);
                            layoutParams14.topToTop = -1;
                            layoutParams14.topToBottom = R.id.ad_icon;
                            i4 = 8;
                        } else {
                            i3 = -1;
                            layoutParams14.startToStart = -1;
                            layoutParams14.startToEnd = R.id.ad_media_container;
                            i4 = 8;
                            layoutParams14.setMarginStart(d(context, 8));
                            layoutParams16.startToStart = -1;
                            layoutParams16.startToEnd = R.id.ad_media_container;
                            layoutParams16.setMarginStart(d(context, 8));
                            layoutParams14.topToTop = 0;
                            layoutParams14.topToBottom = -1;
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams14).topMargin = d(context, i4);
                        layoutParams14.bottomToBottom = i3;
                        layoutParams14.bottomToTop = R.id.ad_cta;
                        layoutParams14.verticalBias = 0.0f;
                        layoutParams16.bottomToBottom = R.id.ad_media_container;
                        layoutParams16.bottomToTop = i3;
                        textView.setLayoutParams(layoutParams14);
                        textView3.setLayoutParams(layoutParams16);
                    }
                }
            } else if (i8 == R.layout.adster_unified_native_anchored_50dp) {
                ViewGroup.LayoutParams layoutParams17 = textView.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams18 = layoutParams17 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams17 : null;
                if (layoutParams18 != null) {
                    ViewGroup.LayoutParams layoutParams19 = textView2.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams20 = layoutParams19 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams19 : null;
                    if (layoutParams20 != null) {
                        ViewGroup.LayoutParams layoutParams21 = ratingBar.getLayoutParams();
                        ConstraintLayout.LayoutParams layoutParams22 = layoutParams21 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams21 : null;
                        if (layoutParams22 != null) {
                            ViewGroup.LayoutParams layoutParams23 = textView3.getLayoutParams();
                            ConstraintLayout.LayoutParams layoutParams24 = layoutParams23 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams23 : null;
                            if (layoutParams24 != null) {
                                ((ViewGroup.MarginLayoutParams) layoutParams18).height = -2;
                                ((ViewGroup.MarginLayoutParams) layoutParams24).height = -2;
                                textView.setGravity(GravityCompat.START);
                                textView3.setGravity(GravityCompat.START);
                                textView.setIncludeFontPadding(true);
                                textView3.setIncludeFontPadding(true);
                                textView.setTranslationY(0.0f);
                                textView3.setTranslationY(0.0f);
                                if (z) {
                                    layoutParams18.startToEnd = R.id.ad_icon;
                                    layoutParams18.startToStart = -1;
                                    layoutParams18.setMarginStart(d(context, 10));
                                    int i12 = R.id.ad_icon;
                                    layoutParams18.topToTop = i12;
                                    layoutParams18.topToBottom = -1;
                                    layoutParams18.bottomToBottom = -1;
                                    layoutParams18.bottomToTop = -1;
                                    layoutParams20.bottomToBottom = i12;
                                    layoutParams20.bottomToTop = -1;
                                    layoutParams22.bottomToBottom = i12;
                                    layoutParams22.bottomToTop = -1;
                                    layoutParams24.topToTop = i12;
                                    layoutParams24.topToBottom = -1;
                                    layoutParams24.bottomToBottom = i12;
                                    layoutParams24.bottomToTop = -1;
                                } else {
                                    layoutParams18.startToEnd = -1;
                                    layoutParams18.startToStart = 0;
                                    layoutParams18.setMarginStart(0);
                                    layoutParams20.bottomToBottom = 0;
                                    layoutParams20.bottomToTop = -1;
                                    layoutParams22.bottomToBottom = 0;
                                    layoutParams22.bottomToTop = -1;
                                    layoutParams24.topToTop = 0;
                                    layoutParams24.topToBottom = -1;
                                    layoutParams24.bottomToBottom = 0;
                                    layoutParams24.bottomToTop = -1;
                                    if (z5) {
                                        layoutParams18.topToTop = 0;
                                        layoutParams18.topToBottom = -1;
                                        layoutParams18.bottomToBottom = -1;
                                        layoutParams18.bottomToTop = -1;
                                        ((ViewGroup.MarginLayoutParams) layoutParams18).topMargin = 0;
                                    } else {
                                        layoutParams18.topToTop = 0;
                                        layoutParams18.topToBottom = -1;
                                        layoutParams18.bottomToBottom = 0;
                                        layoutParams18.bottomToTop = -1;
                                        ((ViewGroup.MarginLayoutParams) layoutParams18).topMargin = 0;
                                    }
                                }
                                textView.setLayoutParams(layoutParams18);
                                textView2.setLayoutParams(layoutParams20);
                                ratingBar.setLayoutParams(layoutParams22);
                                textView3.setLayoutParams(layoutParams24);
                            }
                        }
                    }
                }
            }
        }
        function3.invoke(frameLayout);
        return new HomeInlineTemplateBindResult(true, new HomeInlineTemplateViews(viewGroup, textView, textView2, ratingBar, textView3, imageView, imageView2, frameLayout), z5, homeInlineTemplateContent.e, homeInlineTemplateLayoutConfig.b);
    }

    public static final int d(Context context, int i) {
        return MathKt.f(i * context.getResources().getDisplayMetrics().density);
    }
}
