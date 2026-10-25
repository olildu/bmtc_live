package defpackage;

import app.chalo.fileupload.domain.UploadImageResult;
import app.chalo.userprofile.ui.UserProfileFormDataState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293a;
    public final /* synthetic */ UploadImageResult.UploadedSuccessfully b;

    public /* synthetic */ aj0(UploadImageResult.UploadedSuccessfully uploadedSuccessfully, int i) {
        this.f293a = i;
        this.b = uploadedSuccessfully;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f293a) {
            case 0:
                MinProfileUpdateDataState it = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it, "it");
                return MinProfileUpdateDataState.a(it, null, null, null, 0, false, this.b.f2781a, null, null, 159);
            default:
                return UserProfileFormDataState.a((UserProfileFormDataState) obj, null, null, null, null, null, null, this.b.f2781a, null, false, null, null, 14847);
        }
    }
}
