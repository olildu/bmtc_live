package app.chalo.userprofile.ui.minprofileupdate;

import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MinProfileUpdateContractKt {
    public static final Map a(MinProfileInputState minProfileInputState) {
        Intrinsics.i(minProfileInputState, "<this>");
        if (minProfileInputState instanceof MinProfileInputState.ProfilePhotoInput) {
            return MapsKt.i(new Pair("type", "profileInput"), new Pair("isSkipped", Boolean.valueOf(((MinProfileInputState.ProfilePhotoInput) minProfileInputState).f10385a)));
        }
        if (minProfileInputState instanceof MinProfileInputState.AgeInput) {
            MinProfileInputState.AgeInput ageInput = (MinProfileInputState.AgeInput) minProfileInputState;
            return MapsKt.i(new Pair("type", "ageInput"), new Pair("isSkipped", Boolean.valueOf(ageInput.c)), new Pair("value", ageInput.f10382a));
        }
        if (minProfileInputState instanceof MinProfileInputState.NameAndDobInput) {
            MinProfileInputState.NameAndDobInput nameAndDobInput = (MinProfileInputState.NameAndDobInput) minProfileInputState;
            return MapsKt.i(new Pair("type", "nameAndAgeInput"), new Pair("isSkipped", Boolean.valueOf(nameAndDobInput.d)), new Pair("dobInMillis", String.valueOf(nameAndDobInput.b)), new Pair("nameEntered", Boolean.valueOf(!StringsKt.F(nameAndDobInput.f10384a))));
        }
        if (!(minProfileInputState instanceof MinProfileInputState.GenderInput)) {
            throw new NoWhenBranchMatchedException();
        }
        MinProfileInputState.GenderInput genderInput = (MinProfileInputState.GenderInput) minProfileInputState;
        return MapsKt.i(new Pair("type", "genderInput"), new Pair("isSkipped", Boolean.valueOf(genderInput.b)), new Pair("value", genderInput.f10383a.name()));
    }
}
