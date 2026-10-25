package app.chalo.login.data.mappers;

import app.chalo.login.data.models.app.DpdpaConsentInfoAppModel;
import app.chalo.login.data.models.response.DpdpaConsentInfoResponseApiModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LoginAppModelsToRequestModelsMapperKt {
    public static final DpdpaConsentInfoResponseApiModel a(DpdpaConsentInfoAppModel dpdpaConsentInfoAppModel) {
        Intrinsics.i(dpdpaConsentInfoAppModel, "<this>");
        return new DpdpaConsentInfoResponseApiModel(dpdpaConsentInfoAppModel.f5190a, dpdpaConsentInfoAppModel.b.name());
    }
}
