package app.chalo.login.ui.options;

import app.chalo.login.truecaller.TruecallerError;
import app.chalo.login.truecaller.TruecallerProfile;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class LoginOptionsComponent$initTruecallerAndSetupLoginMethods$3 extends FunctionReferenceImpl implements Function1<ChaloUseCaseResult<TruecallerProfile, TruecallerError>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ChaloUseCaseResult p0 = (ChaloUseCaseResult) obj;
        Intrinsics.i(p0, "p0");
        LoginOptionsComponent loginOptionsComponent = (LoginOptionsComponent) this.receiver;
        loginOptionsComponent.getClass();
        if (p0 instanceof ChaloUseCaseResult.Failure) {
            loginOptionsComponent.Q0(new LoginOptionsIntent.OnTruecallerErrorCallback((TruecallerError) ((ChaloUseCaseResult.Failure) p0).f10418a));
        } else {
            if (!(p0 instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            TruecallerProfile truecallerProfile = (TruecallerProfile) ((ChaloUseCaseResult.Success) p0).f10419a;
            String str = truecallerProfile.f5293a;
            String str2 = str == null ? "" : str;
            String str3 = truecallerProfile.b;
            String str4 = str3 == null ? "" : str3;
            String str5 = truecallerProfile.c;
            String str6 = str5 == null ? "" : str5;
            String str7 = truecallerProfile.d;
            String str8 = str7 == null ? "" : str7;
            String str9 = truecallerProfile.e;
            String str10 = str9 == null ? "" : str9;
            String str11 = truecallerProfile.f;
            String str12 = str11 == null ? "" : str11;
            String str13 = truecallerProfile.g;
            loginOptionsComponent.Q0(new LoginOptionsIntent.OnTruecallerSuccessCallback(str2, str4, str8, str6, str10, str12, str13 == null ? "" : str13));
        }
        return Unit.f17538a;
    }
}
