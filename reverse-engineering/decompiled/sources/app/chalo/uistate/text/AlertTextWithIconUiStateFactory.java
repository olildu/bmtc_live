package app.chalo.uistate.text;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/AlertTextWithIconUiStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertTextWithIconUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AlertTextWithIconUiStateFactory f10077a = new AlertTextWithIconUiStateFactory();

    public static AlertTextWithIconUiState a(String msg, ChaloColorToken.Black black, IconType icon) {
        Intrinsics.i(msg, "msg");
        Intrinsics.i(icon, "icon");
        return new AlertTextWithIconUiState(new AlertTextWithIconSpec(0.0f, 15), new ImageUIState(icon, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), ChaloTextStyleHelper.c(ChaloTextStyleHelper.f10078a, msg, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124));
    }
}
