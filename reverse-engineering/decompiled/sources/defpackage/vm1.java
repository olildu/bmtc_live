package defpackage;

import app.chalo.fileupload.data.exceptions.UploadFileFailedException;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.login.ui.userconsent.UserConsentDataState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.usercommutepreference.data.remote.exception.CreatePlaceException;
import app.chalo.usercommutepreference.data.remote.exception.CreateSavedRideException;
import app.chalo.usercommutepreference.data.remote.exception.DeletePlaceException;
import app.chalo.usercommutepreference.data.remote.exception.DeleteSavedRideException;
import app.chalo.usercommutepreference.data.remote.exception.GetProfileSummaryException;
import app.chalo.usercommutepreference.data.remote.exception.UpdateCommutePreferencesException;
import app.chalo.userprofile.ui.UserProfileFormDataState;
import app.chalo.userprofile.ui.UserProfileFormDialogType;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vm1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19852a;

    public /* synthetic */ vm1(int i) {
        this.f19852a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19852a) {
            case 0:
                UniversalPickerViewState it = (UniversalPickerViewState) obj;
                Intrinsics.i(it, "it");
                return UniversalPickerViewState.a(it, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388479);
            case 1:
                UniversalPickerViewState it2 = (UniversalPickerViewState) obj;
                Intrinsics.i(it2, "it");
                return UniversalPickerViewState.a(it2, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388479);
            case 2:
                return UniversalPickerViewState.a((UniversalPickerViewState) obj, null, null, null, false, false, null, null, false, true, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388351);
            case 3:
                return UniversalPickerViewState.a((UniversalPickerViewState) obj, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388351);
            case 4:
                return UniversalPickerViewState.a((UniversalPickerViewState) obj, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388351);
            case 5:
                return UniversalPickerViewState.a((UniversalPickerViewState) obj, null, null, null, false, false, null, null, false, true, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388351);
            case 6:
                return UniversalPickerViewState.a((UniversalPickerViewState) obj, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388351);
            case 7:
                return UniversalPickerViewState.a((UniversalPickerViewState) obj, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388351);
            case 8:
                UniversalPickerViewState it3 = (UniversalPickerViewState) obj;
                Intrinsics.i(it3, "it");
                return UniversalPickerViewState.a(it3, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, true, null, null, null, 7864319);
            case 9:
                UniversalPickerViewState it4 = (UniversalPickerViewState) obj;
                Intrinsics.i(it4, "it");
                return UniversalPickerViewState.a(it4, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388351);
            case 10:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new UploadFileFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 11:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new DeleteSavedRideException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 12:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new GetProfileSummaryException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 13:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                return new DeletePlaceException(genericChaloErrorResponse4, genericChaloErrorResponse4 != null ? genericChaloErrorResponse4.b : null);
            case 14:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                return new UpdateCommutePreferencesException(genericChaloErrorResponse5, genericChaloErrorResponse5 != null ? genericChaloErrorResponse5.b : null);
            case 15:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                return new CreatePlaceException(genericChaloErrorResponse6, genericChaloErrorResponse6 != null ? genericChaloErrorResponse6.b : null);
            case 16:
                GenericChaloErrorResponse genericChaloErrorResponse7 = (GenericChaloErrorResponse) obj;
                return new CreateSavedRideException(genericChaloErrorResponse7, genericChaloErrorResponse7 != null ? genericChaloErrorResponse7.b : null);
            case 17:
                UserConsentDataState it5 = (UserConsentDataState) obj;
                Intrinsics.i(it5, "it");
                return UserConsentDataState.a(it5, null, null, null, false, null, true, false, false, 223);
            case 18:
                UserConsentDataState it6 = (UserConsentDataState) obj;
                Intrinsics.i(it6, "it");
                return UserConsentDataState.a(it6, null, null, null, false, null, false, false, false, 223);
            case 19:
                UserConsentDataState it7 = (UserConsentDataState) obj;
                Intrinsics.i(it7, "it");
                return UserConsentDataState.a(it7, null, null, null, false, null, false, true, false, 175);
            case 20:
                UserConsentDataState it8 = (UserConsentDataState) obj;
                Intrinsics.i(it8, "it");
                return UserConsentDataState.a(it8, null, null, null, true, null, false, false, false, 231);
            case 21:
                UserConsentDataState it9 = (UserConsentDataState) obj;
                Intrinsics.i(it9, "it");
                return UserConsentDataState.a(it9, null, null, null, false, null, false, false, false, 247);
            case 22:
                String it10 = (String) obj;
                Intrinsics.i(it10, "it");
                return StringsKt.u0(it10).toString();
            case 23:
                UserProfileFormDataState it11 = (UserProfileFormDataState) obj;
                Intrinsics.i(it11, "it");
                return UserProfileFormDataState.a(it11, null, null, null, null, null, null, null, null, false, null, null, 12287);
            case 24:
                return UserProfileFormDataState.a((UserProfileFormDataState) obj, null, null, null, null, null, null, null, null, false, UserProfileFormDialogType.CancelConfirmationDialog.f10350a, null, 12287);
            case 25:
                return UserProfileFormDataState.a((UserProfileFormDataState) obj, null, null, null, null, null, null, null, null, true, null, EmptyList.f17557a, 6143);
            case 26:
                return UserProfileFormDataState.a((UserProfileFormDataState) obj, null, null, null, null, null, null, null, null, false, null, null, 14335);
            case 27:
                return UserProfileFormDataState.a((UserProfileFormDataState) obj, null, null, null, null, null, null, null, null, false, null, null, 14335);
            case 28:
                return UserProfileFormDataState.a((UserProfileFormDataState) obj, null, null, null, null, null, null, null, null, false, null, null, 14335);
            default:
                UserProfileFormDataState it12 = (UserProfileFormDataState) obj;
                Intrinsics.i(it12, "it");
                return UserProfileFormDataState.a(it12, null, null, null, null, null, null, null, null, false, UserProfileFormDialogType.GalleryPermissionRationale.f10352a, null, 12287);
        }
    }
}
