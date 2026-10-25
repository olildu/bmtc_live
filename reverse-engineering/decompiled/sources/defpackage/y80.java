package defpackage;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.instantticket.data.exceptions.InstantTicketOrderCreationFailedException;
import app.chalo.instantticket.data.exceptions.InstantTicketReceiptFetchFailedException;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.DefaultTransformKt;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
import io.ktor.client.plugins.contentnegotiation.JsonContentTypeMatcher;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypeMatcher;
import io.ktor.serialization.kotlinx.KotlinxSerializationConverter;
import io.ktor.serialization.kotlinx.json.JsonSupportKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.InstantComponentSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20086a;

    public /* synthetic */ y80(int i) {
        this.f20086a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.f20086a;
        Unit unit = Unit.f17538a;
        boolean z = true;
        switch (i) {
            case 0:
                HttpClient install = (HttpClient) obj;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = HttpClient.l;
                Intrinsics.i(install, "$this$install");
                DefaultTransformKt.a(install);
                return unit;
            case 1:
                Intrinsics.i(obj, "<this>");
                return unit;
            case 2:
                Intrinsics.i((HttpClientEngineConfig) obj, "<this>");
                return unit;
            case 3:
                ContentNegotiationConfig install2 = (ContentNegotiationConfig) obj;
                Intrinsics.i(install2, "$this$install");
                Json json = ChaloJson.b;
                int i2 = JsonSupportKt.f16877a;
                final ContentType contentType = ContentType.Application.f16764a;
                Intrinsics.i(json, "json");
                Intrinsics.i(contentType, "contentType");
                install2.b.add(new ContentNegotiationConfig.ConverterRegistration(new KotlinxSerializationConverter(json), contentType, contentType.b(contentType) ? JsonContentTypeMatcher.f16707a : new ContentTypeMatcher() { // from class: io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig$defaultMatcher$1
                    @Override // io.ktor.http.ContentTypeMatcher
                    public final boolean a(ContentType contentType2) {
                        Intrinsics.i(contentType2, "contentType");
                        return contentType2.b(contentType);
                    }
                }));
                return unit;
            case 4:
                return IconButtonKt.SurfaceIconToggleButton$lambda$26$lambda$25((SemanticsPropertyReceiver) obj);
            case 5:
                return IconButtonKt.OutlinedIconToggleButton$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
            case 6:
                return IconButtonKt.FilledIconToggleButton$lambda$12$lambda$11((SemanticsPropertyReceiver) obj);
            case 7:
                return IconButtonKt.FilledTonalIconToggleButton$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
            case 8:
                return IconButtonKt.SurfaceIconButton$lambda$23$lambda$22((SemanticsPropertyReceiver) obj);
            case 9:
                return IconKt.Icon$lambda$12$lambda$11$lambda$9$lambda$7((ContentDrawScope) obj);
            case 10:
                return ImeEditCommand_androidKt.finishComposingText$lambda$0((TextFieldBuffer) obj);
            case 11:
                Exception it = (Exception) obj;
                Intrinsics.i(it, "it");
                if (it instanceof CancellationException) {
                    throw it;
                }
                return unit;
            case 12:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                SerialDescriptorImpl serialDescriptorImpl = InstantComponentSerializer.f18095a;
                Intrinsics.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                EmptyList emptyList = EmptyList.f17557a;
                LongSerializer longSerializer = LongSerializer.f18151a;
                PrimitiveSerialDescriptor primitiveSerialDescriptor = LongSerializer.b;
                buildClassSerialDescriptor.a("epochSeconds", primitiveSerialDescriptor, emptyList, false);
                buildClassSerialDescriptor.a("nanosecondsOfSecond", primitiveSerialDescriptor, emptyList, true);
                return unit;
            case 13:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor2 = (ClassSerialDescriptorBuilder) obj;
                SerialDescriptorImpl serialDescriptorImpl2 = kotlinx.datetime.serializers.InstantComponentSerializer.f18059a;
                Intrinsics.i(buildClassSerialDescriptor2, "$this$buildClassSerialDescriptor");
                EmptyList emptyList2 = EmptyList.f17557a;
                LongSerializer longSerializer2 = LongSerializer.f18151a;
                PrimitiveSerialDescriptor primitiveSerialDescriptor2 = LongSerializer.b;
                buildClassSerialDescriptor2.a("epochSeconds", primitiveSerialDescriptor2, emptyList2, false);
                buildClassSerialDescriptor2.a("nanosecondsOfSecond", primitiveSerialDescriptor2, emptyList2, true);
                return unit;
            case 14:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 15:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 16:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 18:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 19:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 20:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 21:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 22:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 23:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                return new InstantTicketReceiptFetchFailedException(genericChaloErrorResponse4, genericChaloErrorResponse4 != null ? genericChaloErrorResponse4.b : null);
            case 24:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                return new InstantTicketOrderCreationFailedException(genericChaloErrorResponse5, genericChaloErrorResponse5 != null ? genericChaloErrorResponse5.b : null);
            case 25:
                InstantTicketWalletAccessState it2 = (InstantTicketWalletAccessState) obj;
                Intrinsics.i(it2, "it");
                return InstantTicketWalletAccessState.a(it2, null, false, false, null, null, false, null, null, false, false, null, false, false, 7935);
            case 26:
                InstantTicketWalletAccessState it3 = (InstantTicketWalletAccessState) obj;
                Intrinsics.i(it3, "it");
                return InstantTicketWalletAccessState.a(it3, null, false, false, null, null, false, WalletStatus.USER_NOT_LOGGED_IN, null, false, false, null, false, false, 8127);
            case 27:
                InstantTicketWalletAccessState it4 = (InstantTicketWalletAccessState) obj;
                Intrinsics.i(it4, "it");
                return InstantTicketWalletAccessState.a(it4, null, false, true, null, null, false, null, null, false, false, null, false, false, 8187);
            case 28:
                InstantTicketWalletAccessState it5 = (InstantTicketWalletAccessState) obj;
                Intrinsics.i(it5, "it");
                return InstantTicketWalletAccessState.a(it5, null, false, false, null, null, false, null, null, false, false, null, false, false, 8187);
            default:
                return InstantTicketWalletAccessState.a((InstantTicketWalletAccessState) obj, null, false, false, null, null, false, null, null, true, false, null, false, false, 7935);
        }
    }
}
