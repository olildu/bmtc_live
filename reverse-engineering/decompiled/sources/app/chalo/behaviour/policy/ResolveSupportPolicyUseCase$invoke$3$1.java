package app.chalo.behaviour.policy;

import app.chalo.scenes.args.WebViewArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveSupportPolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<ResolvedSupportPolicy, SupportPolicyOverride, ResolvedSupportPolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveSupportPolicyUseCase$invoke$3$1 f1065a = new ResolveSupportPolicyUseCase$invoke$3$1();

    public ResolveSupportPolicyUseCase$invoke$3$1() {
        super(2, ReportProblemPolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/ResolvedSupportPolicy;Lapp/chalo/behaviour/policy/SupportPolicyOverride;)Lapp/chalo/behaviour/policy/ResolvedSupportPolicy;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ReportProblemPath reportProblemPath;
        ReportProblemPath whatsAppPath;
        ResolvedSupportPolicy p0 = (ResolvedSupportPolicy) obj;
        SupportPolicyOverride supportPolicyOverride = (SupportPolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (supportPolicyOverride == null) {
            return p0;
        }
        ReportProblemPathOverride reportProblemPathOverride = supportPolicyOverride.f1083a;
        if (reportProblemPathOverride == null) {
            reportProblemPath = p0.f1075a;
        } else if (reportProblemPathOverride.equals(ReportProblemPathOverride.FreshChat.INSTANCE)) {
            reportProblemPath = ReportProblemPath.FreshChatPath.f1032a;
        } else {
            if (reportProblemPathOverride instanceof ReportProblemPathOverride.WebView) {
                ReportProblemPathOverride.WebView webView = (ReportProblemPathOverride.WebView) reportProblemPathOverride;
                whatsAppPath = new ReportProblemPath.WebViewPath(new WebViewArgs(webView.b, webView.c, webView.d, webView.e));
            } else {
                if (!(reportProblemPathOverride instanceof ReportProblemPathOverride.WhatsApp)) {
                    throw new NoWhenBranchMatchedException();
                }
                whatsAppPath = new ReportProblemPath.WhatsAppPath(((ReportProblemPathOverride.WhatsApp) reportProblemPathOverride).b);
            }
            reportProblemPath = whatsAppPath;
        }
        Boolean bool = supportPolicyOverride.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : p0.b;
        String str = supportPolicyOverride.c;
        if (str == null) {
            str = p0.c;
        }
        return new ResolvedSupportPolicy(reportProblemPath, zBooleanValue, str);
    }
}
