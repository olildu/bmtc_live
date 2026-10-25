package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerToolbarUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRScannerToolbarUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QRScannerToolbarUISpecs f10722a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;

    public QRScannerToolbarUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, int i) {
        QRScannerToolbarUISpecs qRScannerToolbarUISpecs = new QRScannerToolbarUISpecs();
        ImageUIState imageUIState = new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        TextUIState.ChaloTextUIState title = (i & 4) != 0 ? new TextUIState.ChaloTextUIState("", UITextStyle.BodySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120) : chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState3 = (i & 16) != 0 ? new TextUIState.ChaloTextUIState("", UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : chaloTextUIState2;
        Intrinsics.i(title, "title");
        this.f10722a = qRScannerToolbarUISpecs;
        this.b = imageUIState;
        this.c = title;
        this.d = chaloTextUIState3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRScannerToolbarUIState)) {
            return false;
        }
        QRScannerToolbarUIState qRScannerToolbarUIState = (QRScannerToolbarUIState) obj;
        return Intrinsics.d(this.f10722a, qRScannerToolbarUIState.f10722a) && Intrinsics.d(this.b, qRScannerToolbarUIState.b) && Intrinsics.d(this.c, qRScannerToolbarUIState.c) && Intrinsics.d(this.d, qRScannerToolbarUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.e(this.b, this.f10722a.hashCode() * 31, 31), 961);
    }

    public final String toString() {
        return "QRScannerToolbarUIState(qrScannerToolbarUISpecs=" + this.f10722a + ", backIconUIState=" + this.b + ", title=" + this.c + ", backBtnEventHandler=null, rightItemUIState=" + this.d + ")";
    }
}
