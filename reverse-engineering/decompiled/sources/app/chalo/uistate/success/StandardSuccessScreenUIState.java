package app.chalo.uistate.success;

import androidx.compose.ui.unit.Dp;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/uistate/success/StandardSuccessScreenUIState;", "", "SuccessWithGifMsgAndCta", "Lapp/chalo/uistate/success/StandardSuccessScreenUIState$SuccessWithGifMsgAndCta;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StandardSuccessScreenUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/success/StandardSuccessScreenUIState$SuccessWithGifMsgAndCta;", "Lapp/chalo/uistate/success/StandardSuccessScreenUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessWithGifMsgAndCta extends StandardSuccessScreenUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuccessWithGifMsgAndCtaUISpecs f10073a;
        public final GifImageUIState b;
        public final GifImageUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final TextUIState.ChaloTextUIState e;
        public final ImageUIState f;
        public final TextUIState.ChaloTextUIState g;
        public final ButtonUIState h;
        public final ButtonUIState i;

        public SuccessWithGifMsgAndCta(GifImageUIState gifImageUIState, GifImageUIState gifImageUIState2, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState3, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, int i) {
            SuccessWithGifMsgAndCtaUISpecs successWithGifMsgAndCtaUISpecs = new SuccessWithGifMsgAndCtaUISpecs();
            if ((i & 2) != 0) {
                float f = 200;
                gifImageUIState = new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(f)), Dp.m7276boximpl(Dp.m7278constructorimpl(f))));
            }
            gifImageUIState2 = (i & 4) != 0 ? null : gifImageUIState2;
            imageUIState = (i & 32) != 0 ? null : imageUIState;
            chaloTextUIState3 = (i & 64) != 0 ? null : chaloTextUIState3;
            this.f10073a = successWithGifMsgAndCtaUISpecs;
            this.b = gifImageUIState;
            this.c = gifImageUIState2;
            this.d = chaloTextUIState;
            this.e = chaloTextUIState2;
            this.f = imageUIState;
            this.g = chaloTextUIState3;
            this.h = buttonUIState;
            this.i = buttonUIState2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessWithGifMsgAndCta)) {
                return false;
            }
            SuccessWithGifMsgAndCta successWithGifMsgAndCta = (SuccessWithGifMsgAndCta) obj;
            return Intrinsics.d(this.f10073a, successWithGifMsgAndCta.f10073a) && Intrinsics.d(this.b, successWithGifMsgAndCta.b) && Intrinsics.d(this.c, successWithGifMsgAndCta.c) && Intrinsics.d(this.d, successWithGifMsgAndCta.d) && Intrinsics.d(this.e, successWithGifMsgAndCta.e) && Intrinsics.d(this.f, successWithGifMsgAndCta.f) && Intrinsics.d(this.g, successWithGifMsgAndCta.g) && Intrinsics.d(this.h, successWithGifMsgAndCta.h) && Intrinsics.d(this.i, successWithGifMsgAndCta.i);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f10073a.hashCode() * 31)) * 31;
            GifImageUIState gifImageUIState = this.c;
            int iF = r30.f(this.d, (iHashCode + (gifImageUIState == null ? 0 : gifImageUIState.hashCode())) * 31, 31);
            TextUIState.ChaloTextUIState chaloTextUIState = this.e;
            int iHashCode2 = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
            ImageUIState imageUIState = this.f;
            int iHashCode3 = (iHashCode2 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
            TextUIState.ChaloTextUIState chaloTextUIState2 = this.g;
            int iHashCode4 = (iHashCode3 + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
            ButtonUIState buttonUIState = this.h;
            int iHashCode5 = (iHashCode4 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
            ButtonUIState buttonUIState2 = this.i;
            return iHashCode5 + (buttonUIState2 != null ? buttonUIState2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuccessWithGifMsgAndCta(specs=");
            sb.append(this.f10073a);
            sb.append(", gif=");
            sb.append(this.b);
            sb.append(", confetti=");
            sb.append(this.c);
            sb.append(", successMsg=");
            sb.append(this.d);
            sb.append(", description=");
            sb.append(this.e);
            sb.append(", descriptionImage=");
            sb.append(this.f);
            sb.append(", descriptionSubtext=");
            sb.append(this.g);
            sb.append(", positiveActionButton=");
            sb.append(this.h);
            sb.append(", negativeActionButton=");
            return hq0.j(sb, this.i, ")");
        }
    }
}
