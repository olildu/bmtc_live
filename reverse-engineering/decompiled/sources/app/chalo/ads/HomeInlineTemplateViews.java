package app.chalo.ads;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/HomeInlineTemplateViews;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeInlineTemplateViews {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f788a;
    public final TextView b;
    public final TextView c;
    public final RatingBar d;
    public final TextView e;
    public final ImageView f;
    public final ImageView g;
    public final FrameLayout h;

    public HomeInlineTemplateViews(ViewGroup viewGroup, TextView textView, TextView textView2, RatingBar ratingBar, TextView textView3, ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
        this.f788a = viewGroup;
        this.b = textView;
        this.c = textView2;
        this.d = ratingBar;
        this.e = textView3;
        this.f = imageView;
        this.g = imageView2;
        this.h = frameLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeInlineTemplateViews)) {
            return false;
        }
        HomeInlineTemplateViews homeInlineTemplateViews = (HomeInlineTemplateViews) obj;
        return Intrinsics.d(this.f788a, homeInlineTemplateViews.f788a) && Intrinsics.d(this.b, homeInlineTemplateViews.b) && Intrinsics.d(this.c, homeInlineTemplateViews.c) && Intrinsics.d(this.d, homeInlineTemplateViews.d) && Intrinsics.d(this.e, homeInlineTemplateViews.e) && Intrinsics.d(this.f, homeInlineTemplateViews.f) && Intrinsics.d(this.g, homeInlineTemplateViews.g) && Intrinsics.d(this.h, homeInlineTemplateViews.h);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f788a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        FrameLayout frameLayout = this.h;
        return iHashCode + (frameLayout == null ? 0 : frameLayout.hashCode());
    }

    public final String toString() {
        return "HomeInlineTemplateViews(rootContainer=" + this.f788a + ", headlineView=" + this.b + ", bodyView=" + this.c + ", ratingView=" + this.d + ", ctaView=" + this.e + ", iconView=" + this.f + ", choiceView=" + this.g + ", mediaContainer=" + this.h + ")";
    }
}
